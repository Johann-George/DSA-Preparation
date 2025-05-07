class nonRepeating:
    def findFirst(self,string):
        Dict_nonRepeating={}
        #maintain a hash table to store the values
        for i in range(len(string)):
            if string[i] not in Dict_nonRepeating:
                Dict_nonRepeating.update({string[i].lower():1})
            else:
                Dict_nonRepeating[string[i].lower()]+=1
        #return the value of the first key with value 1
        for key,value in Dict_nonRepeating.items():
            if value==1:
                return key

nr = nonRepeating()
print(nr.findFirst("Academy"))

