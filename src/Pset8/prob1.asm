# find the smallest and biggest number in an array
 

.data
table: .word 3, -1, 6, 5, 7, -3, -15, 18, 2 	# array for which we will compute the sum
N: .word 9					# define total numbers

strMax: .asciiz "\nThe maximum element in the array is : "
	.align 2 
strMin: .asciiz "\nThe minimum element in the array is : "
	.align 2 

.text
.globl main

main: 	la 	$t0, table		# initialize starting address 3, -1, 6, 5, 7, -3, -15, 18, 2 
	lw 	$t1, N($0)		# initialize loop count
	lw 	$t3, 0($t0)
	add 	$t2, $t2, $t3	# initialize max
	add 	$t4, $t4, $t3	# initialize min

loop:	lw 	$t3, 0($t0)		# load first element
	addi 	$t0, $t0, 4	# point to the next word
	addi 	$t1, $t1, -1	# decrement count
	
	bgt 	$t3, $t2, then  	# if the number is greater than the current max
	blt 	$t3, $t4, thenl	# if the number is less than the current min
	bne 	$t1, $zero, loop	# check if done
	j 	pres

then:	move 	$t2, $t3		# move the current number to max	
	bne 	$t1, $zero, loop	# check if done
	j 	pres

thenl:	move 	$t4, $t3
	bne 	$t1, $zero, loop	# check if done
	j 	pres

pres:	li 	$v0, 4
	la 	$a0, strMax
	syscall
	
	li 	$v0, 1
	move 	$a0, $t2
	syscall

	li 	$v0, 4
	la 	$a0, strMin
	syscall

	li 	$v0, 1
	move 	$a0, $t4
	syscall
 	
	li 	$v0, 10
	syscall
