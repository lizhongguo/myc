section .data
t resb 100
buffer db 0 ,0,0
b dd	 0
a dd 0
section .text
global _start
_start:

jmp label_func0
label_main:
push rbp
mov rbp,rsp
mov eax,[b]
push rax
mov eax,0
push rax
pop rax
pop rbx
cmp eax,ebx
jz label_bool_10
push 0
jmp label_bool_20
label_bool_10:push 1
label_bool_20:
pop rax
cmp eax,1
jnz label_if00
mov eax,34
push rax
pop rax
mov [b],eax
label_if00:
mov eax,[b]
push rax
push 1
call label_print
mov rsp,rbp
pop rbp
ret
label_func0:
jmp label_func1
label_test:
push rbp
mov rbp,rsp
mov rax,[ rbp+8+8+8]
mov [a],rax
mov eax,[a]
push rax
push 1
call label_print
mov rsp,rbp
pop rbp
ret
label_func1:
call label_main
jmp label_a
label_print:
xor rcx,rcx
xor rax,rax
push rbp
mov rbp,rsp
mov rax,[rbp+8+8*2]
label_prog:
mov rbx,10
div bl
add ah,30h
mov ebx,buffer
sub ebx,ecx
dec ebx
mov [ebx],ah
mov ah,0
inc rcx
cmp rax,0
jnz label_prog
mov ax,4
mov ebx,1
mov edx,ecx
mov ecx,buffer
sub ecx,edx
int 80h
mov rsp,rbp
pop rbp
ret
label_a:
mov ax,1
mov ebx,0
int 0x80

