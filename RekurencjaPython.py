# Task: A parrot has lived less than 100 years (input data) and can only answer 
# "yes" and "no" to questions. Develop a program that determines how many questions 
# to ask the parrot to find out its age?

def parrot_howmany(max_age,x=0):
    if max_age>1:
        return(parrot_howmany(max_age//2, x+1))
    else:
        return (x+1)

print(parrot_howmany(100))
# print(parrot_howmany(1))
