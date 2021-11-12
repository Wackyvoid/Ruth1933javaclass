#8:05
def comm(str):
    chara = {}
    most = ''
    set = 0
    for letter in str: #Adds every letter in string in a dict.
        chara.update({letter:0})
    for i in str: #Counts each time a letter is in the string by updating the dictionary
        chara[i] += 1
    for i in chara: #Compares each letter in the string and finds the letter that appears the most
        if chara[i] > set:
            set = chara[i]
            most = i
    return (most, set) #returns the letter that appears the most along with the number of times it appears


# compare first and last letters till the end
def pali(str):
    if str == '': #base case - if the string is empty stop
        return str
    else:
        print(str)
        return str[-1] + pali(str[:-1]) #reverses the string

def compare(str): # helper function that compares the og string to the reversed str from pali
    print('pali',pali(str))
    str2 = pali(str)
    return str == str2 #returns true or false if string is a pali


class Circle:

    def __init__(self,radius): #constructor that takes in radius
        self.rad = radius #initializes radius

    def getRadius(self):#whats MY radius?
        return self.rad


    def setRadius(self,radius): #resets self.rad into a different value
        self.rad = radius

    def getArea(self): #calculates area using formula and radius
        area = (3.14159)*((self.rad)**2)
        return area
    def getDiameter(self):
        dia = self.rad * 2
        return dia
    def getCircumference(self):
        circ = 2 * (3.14159) * (self.rad)
        return circ
    def __eq__(self,circle2):
        rad2 = circle2.getRadius()
        return self.rad == rad2
#The secret message is the output of this program.
# public static void secretMessage() {
#     String message = "Kiwi";
#
#     for (char c : message.toCharArray())
#         System.out.print(c);
# }
