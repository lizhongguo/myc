.data
a : .int 0

.text
.global _start
_start:
mov $1, %eax;
pushq %rax;
popq %rax;
movl %eax , a;
pushq %rax;
label0:
mov $10, %eax;
pushq %rax;
movl a, %eax;
pushq %rax;
popq %rbx;
popq %rax;
subl %ebx,%eax;
pushq %rax;
jz llabel0;
movl a, %eax;
pushq %rax;
mov $1, %eax;
pushq %rax;
popq %rbx;
popq %rax;
addl %ebx,%eax;
pushq %rax;
popq %rax;
movl %eax , a;
pushq %rax;
jmp label0;
llabel0:
mov $10, %eax;
pushq %rax;
movl a, %eax;
pushq %rax;
popq %rbx;
popq %rax;
subl %ebx,%eax;
pushq %rax;
jz llabel1
mov $13, %eax;
pushq %rax;
popq %rax;
movl %eax , a;
pushq %rax;
jmp label1;
llabel1:
mov $8, %eax;
pushq %rax;
popq %rax;
movl %eax , a;
pushq %rax;
label1:

movl $0,%ebx;
movl $1,%eax;
int $0x80;
