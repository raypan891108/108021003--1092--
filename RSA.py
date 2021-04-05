class RSA:
    def __init__(self):
        print("Hello")
        print(self.genRandomList())
        self.p, self.q = map(int, input().split())
        self.N = self.p * self.q
        self.N1 = (self.p-1) * (self.q-1)
        print(genEList())
        self.e = int(input())
    
    def encrypt(self,msg):
        print("encrypt")
    
    def decrypt(self,msg):
        print(decrypt)
        
    def isPrime(self,n):
        for i in range(2,n//2):
            if n % i == 0:
                return False
        return True
        
    def genRandomList(self):
        data = []
        while len(data) < 6:
            n = random.randint(1024,65535)
            if self.isPrime(n):
                data.append(n)
        return data
    
    def fun(self, N1, e):
        maxVal = max(N1, e)
        minVal = min(N1, e)
        if maxVal % minVal == 0:
            if maxVal == 1:
                return true
            else:
                return false
        else:
            return self.fun(minVal, maxVal%minVal)
        
    def getEList(self):
        data = []
        while len(data) < 6:
            n = random.randint(1024,65535)
            if self.fun(self.N1,n):
                data.append(n)
        return data
