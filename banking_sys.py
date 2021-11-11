// This a simple banking program which is my first successfully completed project. 
// 
import random

class Customer():
    def __init__(self):
        self.pin = random.randrange(1000) + 10**3
        bin_list = [4,0,0,0,0,0]
        ccn = random.randrange(100000000) + 10**8
        card_list = bin_list + list(map(int, str(ccn))) 
        for index, digit in enumerate(card_list):
            if index%2 == 0:
                card_list[index]= card_list[index] * 2
                if card_list[index] > 9:
                    card_list[index] = card_list[index] - 9

        sum = 0
        for i in card_list:
            sum = sum + i
        x = range(1,10,1)
        for i in x:
            if (sum + i) % 10 == 0:
                checksum = i
        checksum = 0       
        bin = int("".join(map(str,bin_list)))
        self.cardNum = int(str(bin) + str(ccn) + str(checksum))
        print('Your card has been created')
        print('Your card number:')
        print(self.cardNum)
        print('Your card PIN:')
        print(self.pin)
    
    def login():
        a = int(input('Enter your card number:\n'))
        b = int(input('Enter your PIN:\n'))
        if a == self.cardNum and b == self.pin:
            print('You have successfully logged in!')
            while True:
                ans = int(input("1. Balance\n2. Log Out \n0. Exit"))
                if ans == 1:
                    print('Balance:',0)
                elif ans == 2:
                    print('You have successfully logged out!')
                    break
                else:
                    print('Bye')
                    exit()
                    

        else:
            print('Wrong card number or PIN')
   

while True:
    inp = int(input('1. Create an account \n2. Log into account \n0. Exit \n'))
    if inp == 1:
        cust = Customer()
    elif inp == 2:
        login()
    else:
        break

        



