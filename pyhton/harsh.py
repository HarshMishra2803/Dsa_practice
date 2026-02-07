# a = int(input("enter"))
# b = int(input("enter"))
# c = int(input("enter"))
# d= int(input("enter"))
# e = int(input("enter"))
# sum = a+b+c+d+e
# avg = sum /5
# print(avg)


# principle = int(input("enter the principle"))
# rate = int(input("enter the rate"))
# time= int(input("enter the time"))

# simpleInterst = principle * rate * time/100
# print(simpleInterst,type(simpleInterst))


# car = int ( input( "enter the speed in km"))
# time = int(input("enter the time of car"))

# avergae_speed = car/time
# print(avergae_speed)
# s = input("Enter your Name")
# print(len(s))
# print(s.count("h"))
# print(s[::-1])
# print(s.endswith("a"))
# print(s.startswith("m"))
# print(s.capitalize())
# print(s.upper())
# print(s.title())
# print(s.strip())
# print(s.find("a"))
# print(s.)

# num  = int ( input ( "enter your number"))

# if(num%2==0):
#     print("number is even")
# else:
#     print("the number is odd")    

# # Leap Year
# num = int(input("enter the year"))
# if((num%4==0 or num%400==0) and num%100!=0
#    ):
#     print("leap year")
# else:
#     print("not a leap year") 

# num1 = int(input("enter"))       
# num2 = int(input("enter"))   

# if(num1 == num2):
#     print("the numbers are equal")
# else:
#     print("the number are not safe")    


# Greatest Among the three number
# num1 = int(input("enter the number"))
# num2= int(input("enter the number"))
# num3 = int(input("enter the number"))

# if(num1>num2):
#     if(num1>num3):
#         print("Num1 is the greatest")    
# elif(num2>num1):
#     if(num2>num3):
#         print("Num2 is the Greatest")
# else:
#     print("Num3 is the Greatest")   


# USING AND
# if(num1>num2 and num1>num3):
#     print("num1 is the largest")
# elif(num2>num1 and num2>num3):
#     print("Num2 is the greatest")    
# else:
#     print("Num3 is the greatest")  
  

# num = int(input("Enter the Number"))

# list1 = []
# list1 = ["harsh","harsh1","harsh2","harsh3","harsh5"] # hetrogenous value store hoti h
# print(list1[::])
# print(list1[:-1])
# print(list1.extend("harsh"))

# name = ["aman","akash","arya","aditya","Aarav"]
# print(max(name))
# print(min(name))


# list = [1,2,3,4,5]
# print(list[:1])
# print(list[-1::])
# print(len(list))

# length = len(list)
# print(min(list))
# print(max(list))
# total = sum(list)

# avg =total/length

# print(avg) 



# student = {
#     "name":"akash",
#     "age" : "18",
#     "rollno":"20",
#     "subject":["phyiscs","chemistrt","biology"],
#     "marks":[20,30,40]
# }
# print(student.pop("name"))
# print(student)

# student["name"] = "harsh"
# print(student)


# country = {
#     "India" : " Delhi",
#     "Russia" : "mosqo",
#     "USA" : "washingtonDc",
#     "Pakistan": "islambad",
#     "Bangladesh":"dhaka"
# }

# print(country.get("India"))
# country["Japan"] = "Tokyo"
# print(country)

# country["USA"] = "NewYork"
# print(country)

# print(country.pop("Pakistan"))
# print(country)

# # list of dictionary

# students = [
#     {"name" : "Alice","age":20},
#     {"name" : "bob","age":21},
#     {"name" : "charlie","age":19},
# ]
# print(students[0]["age"])

# for i in range(0,3):
#     print(students)
# # for i in range(100):
# #     print("hello chauhan")    

# str1 = "HarshMishra"
# for char in str1:
#     print(char, end =" ")

# Pattern   
# *
# **
# ***
# ****

# row = 6 

# for i in range(1, row + 1):
#     print("*" * i)

# n = 4
# for i in range(1,n+1):
#     for j in range(i):
#         print("*",end = " ")

#     print()    

 #    *
 #   * *
 #  * * *  
 #  * * * *   

 
# file handling / Functions / Modules


# read mode  write modea

with open("harsh.txt","r") as f :
    content =f.read()
    print(content)

# read - yae pura read karta ha
# readline - yae sirf line by line chalta ha
# readines - yae multiple  lines read karta ha but list mae 

