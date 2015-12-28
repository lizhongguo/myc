section .data
t resb 100
buffer db 10 ,0,0
b dd	 0
a dd	 0
k dd	 0
m dd 0
n dd 0
section .text
global _start
_start:

jmp label_func0
label_main:
push rbp
mov rbp,rsp
mov eax,12
push rax
mov eax,4
push rax
push 2
call label_min
push rax
pop rax
mov [a],eax
mov eax,[a]
push rax
push 1
call label_print
label_while0:
mov eax,[a]
push rax
mov eax,0
push rax
pop rax
pop rbx
cmp eax,ebx
jl label_bool_10
push 0
jmp label_bool_20
label_bool_10:push 1
label_bool_20:
pop rax
cmp eax,1
jnz label_while20
mov eax,[a]
push rax
mov eax,1
push rax
pop rbx
pop rax
sub eax,ebx
push rax
pop rax
mov [a],eax
mov eax,[a]
push rax
push 1
call label_print
jmp label_while0
label_while20:
mov eax,0
push rax
pop rax
mov [b],eax
label_for0:
mov eax,[b]
push rax
mov eax,9
push rax
pop rax
pop rbx
cmp eax,ebx
jg label_bool_11
push 0
jmp label_bool_21
label_bool_11:push 1
label_bool_21:
pop rax
cmp eax,1
jnz label_for20
mov eax,0
push rax
pop rax
mov [a],eax
label_for1:
mov eax,[a]
push rax
mov eax,3
push rax
pop rax
pop rbx
cmp eax,ebx
jg label_bool_12
push 0
jmp label_bool_22
label_bool_12:push 1
label_bool_22:
pop rax
cmp eax,1
jnz label_for21
mov eax,[b]
push rax
push 1
call label_print
mov eax,[a]
push rax
mov eax,1
push rax
pop rbx
pop rax
add eax,ebx
push rax
pop rax
mov [a],eax
jmp label_for1
label_for21:
mov eax,[b]
push rax
mov eax,1
push rax
pop rbx
pop rax
add eax,ebx
push rax
pop rax
mov [b],eax
jmp label_for0
label_for20:
mov rsp,rbp
pop rbp
ret
label_func0:
jmp label_func1
label_min:
push rbp
mov rbp,rsp
mov rax,[ rbp+16+16]
mov [m],rax
mov rax,[ rbp+16+8]
mov [n],rax
mov eax,[m]
push rax
mov eax,[n]
push rax
pop rax
pop rbx
cmp eax,ebx
jg label_bool_13
push 0
jmp label_bool_23
label_bool_13:push 1
label_bool_23:
pop rax
cmp eax,1
jnz label_if10
mov eax,[m]
push rax
pop rax
mov [k],eax
jmp label_if20
label_if10:
mov eax,[n]
push rax
pop rax
mov [k],eax
label_if20:
mov eax,[k]
push rax
pop rax
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
inc edx
int 80h
mov rsp,rbp
pop rbp
ret
label_a:
mov ax,1
mov ebx,0
int 0x80

