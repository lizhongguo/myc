f = open('/home/lzg/t2/b')
data = ''
text = ''
for line in f:
	if line[0:5] == '.data':
		data = data + line[6:]
	if line[0:5] == '.code':
		text = text +line[6:]
print '.data'
print data
print '.text'
print '.global _start'
print '_start:'
print text
print 'movl $0,%ebx;'
print 'movl $1,%eax;'
print 'int $0x80;'
