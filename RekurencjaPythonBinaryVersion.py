# /******************************************************************************

# Welcome to GDB Online.
#   GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
#   C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
#   Code, Compile, Run and Debug online from anywhere in world.

# *******************************************************************************/
def parrot_howmany(max_age):
    a= "{0:b}".format(max_age)
    print(a)
    return(len(a))
print(parrot_howmany(100))
