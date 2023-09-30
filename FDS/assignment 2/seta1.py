'''import numpy  as np
data=np.array([[0,1],[2,3]])
print("Maximum Value in given Flattened Array is : ",np.max(data))
print("Minimum Value in given Flattened Array is : ",np.min(data))'''

#2

'''import numpy as np
p1=[4,5,6]
p2=[8,9,1]
dist=np.linalg.norm(p1,p2)
print(" Euclidian distance between two point is :",dist)'''


#3
'''
import numpy  as np
data=np.array([10,12,13,11,22,33,25,26])
Mean=np.mean(data)
print("Mean is : ",Mean)
Range=(np.max(data)) - (np.min(data))
print("Range is : ",Range)
q3,q1=np.percentile(data,[75,25])
iqrvalue=q3-q1
print("IQR is : ",iqrvalue)
'''

#4
'''
import numpy as np
def distsum(x,y,n):
    sum1=0
    for i in range(n):
        for j in range(i+1,n):
            sum1 = sum1 + (abs(x[i]-x[j])) + (abs(y[i]-y[j]))
    return sum1

x=[10,11,12,13,14]
y=[6,7,8,9,1]
n=len(x)
print(" Manhatten distance is : ",distsum(x,y,n))
'''

#5
'''
import numpy as np
import matplotlib.pyplot as plt
nums=np.array([0.5,0.7,1,1.2,1.3,2.1])
bins=np.array([0,1,2,3])
print("Result : ",np.histogram(nums,bins))
plt.hist(nums,bins,color="blue",alpha=0.5)
plt.show()
'''

#6
import pandas as pd
from matplotlib.pyplot import* 
df=pd.DataFrame(columns=["name","grad_per","age"])
df.loc[0]=["sanchi",90.20,20]
df.loc[1]=["tejal",91.20,21]
df.loc[2]=["anu",92.20,22]
df.loc[3]=["payal",93.20,19]
df.loc[4]=["shrushti",94.20,20]
df.loc[5]=["ashish",95.20,22]
df.loc[6]=["shreya",96.20,23]
print(df)
#Average age of stud
print(df.describe())
















