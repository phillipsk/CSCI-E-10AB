## palindrome.asm -- reads a line of text and tests whether it is a palindrome.
## Register usage:
##	$t1	- A.
##	$t2	- B.
##	$t3	- the character *A.
##	$t4	- the character *B.
##	$v0	- syscall parameter / return values.
##	$a0	- syscall parameters.
##	$a1	- syscall parameters.

	.globl  test_loop
        .globl  length_loop
        .globl  string_space
	    .text
main:				        		# SPIM starts by jumping to main.
					  		# read the string S:
	la      $a0, string_space
	li      $a1, 1024
	li      $v0, 8	            			# load "read_string" code into $v0.
	syscall	

	la      $t1, string_space			# A <- S.

	la      $t2, string_space    			# we need to move B to the end
length_loop:			        		# of the string:
	lb	$t3, ($t2)	           		# load the byte *B into $t3.
	beqz	$t3, end_length_loop       		# if $t3 == 0, branch out of loop.
	addu	$t2, $t2, 1	        		# otherwise, increment B,
	b	length_loop		  		# and repeat the loop.
end_length_loop:
	subu	$t2, $t2, 2	       			# subtract 2 to move B back past
				       			#  the '\0' and '\n'.
test_loop:
	bge     $t1, $t2, is_palin	 		# if A >= B, it is a palindrome.
	
loopc:

# get the first valid character from the front
loopa:	lb      $t3, ($t1)         			# load the byte *A into $t3,
	addi 	$a1, $t3, 0
	jal 	vchar	
	beqz	$v1, getnxta 
	move	$t3, $v1	

#get the first valid character from the back	
loopb:	lb      $t4, ($t2)	       			# load the byte *B into $t4.
	addi 	$a1, $t4, 0
	jal 	vchar	
	beqz	$v1, getnxtb 
	move	$t4, $v1	

# to the palindrome testing
	bne     $t3, $t4, not_palin	  		# if $t3 != $t4, not a palindrome.
							# Otherwise,
	addu	$t1, $t1, 1                		#  increment A,
	subu	$t2, $t2, 1                		#  decrement B,
	b	test_loop                  	   	#  and repeat the loop.

#advance pointer fomr beginning
getnxta:
	addu	$t1, $t1, 1                		#  increment A,	
	j	loopa

#advance pointer from end
getnxtb:
	subu	$t2, $t2, 1
	j 	loopb

is_palin:	                   			# print the is_palin_msg, and exit.
	la         $a0, is_palin_msg
	li         $v0, 4
	syscall
	b          exit

not_palin:
	la         $a0, not_palin_msg	  		# print the is_palin_msg, and exit.
	li         $v0, 4
	syscall

exit:			                  		# exit the program:
	li		$v0, 10	          		# load "exit" into $v0.
	syscall			          		# make the system call.


# routine to filter out valid alphanumeric characters. For capitals, it returns a small case as well
vchar:
	addi 	$v1, $a1, 0 
	addi 	$t8, $zero, 64
	sgt 	$t6, $a1, $t8
	slti 	$t7, $a1, 91
	and 	$t5, $t6, $t7
	beqz 	$t5, next1
	addi 	$v1, $a1, 32 				#convert into small letters
	j 	end

next1:	addi 	$t8, $zero, 47
	sgt 	$t6, $a1, $t8
	slti 	$t7, $a1, 58
	and 	$t5, $t6, $t7
	beqz 	$t5, next2
	j 	end

next2:	addi 	$t8, $zero, 96
	sgt 	$t6, $a1, $t8
	slti 	$t7, $a1, 123
	and 	$t5, $t6, $t7
	bnez 	$t5, end
	addi 	$v1, $zero, 0

end: 	jr 	$ra

## Here is where the data for this program is stored:
	.data
string_space:	.space	1024  	# set aside 1024 bytes for the string.
is_palin_msg:	.asciiz "The string is a palindrome.\n"
not_palin_msg:	.asciiz "The string is not a palindrome.\n"
## end of palindrome.asm
