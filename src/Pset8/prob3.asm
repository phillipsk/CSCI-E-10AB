# program to print perfect numbers

.data
A: .word 5
B: .word 500		# define the range
S: .asciiz " "
   .align 2

.text
.globl main

main:	
	lw 	$t1, A($0)		# load in t1
	lw 	$t2, B($0)		# load in t2

while:		
	addi 	$a1, $t1, 0	# add t1 in a1
	addi 	$t1, $t1, 1	# increment t1

	jal 	perfect		# call perfect
	beq 	$v1, $zero, nonperfect

	#print the perfect number
	li 	$v0, 1
	add 	$a0, $a1, $zero
	syscall	

	li 	$v0, 4
	la 	$a0, S
	syscall	

	ble 	$t1, $t2, while	# check if done

nonperfect: 
	ble 	$t1, $t2, while	# check if done
	j exit			# exit
	
exit:	
	li 	$v0, 10		
	syscall


perfect: 
	addi 	$t3, $zero, 1	# initialize t3 register with the value one
	addi 	$t6, $zero, 0
	inner:	
		
		divu 	$a1, $t3	# divide a1 by t3
		mfhi 	$t4		# copy remainder to a3
		addi 	$t5, $t3, 0
		addi 	$t3, $t3, 1	# increment t3
		bnez 	$t4, repeat		# if remainder t4 is zero				
		add 	$t6, $t6, $t5		
		blt 	$t3, $a1, inner	# repeat loop if required
		
	repeat: 
		blt 	$t3, $a1, inner	# repeat loop if required

		beq 	$t6, $a1, ret1
		addi 	$v1, $zero, 0
		j 	end
	
	ret1:	
		addi 	$v1, $zero, 1
		j 	end

	end:	jr 	$ra	
		