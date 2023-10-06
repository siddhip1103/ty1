import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

x=np.random.rand(50)
'''
#LINE CHART
plt.plot(x)
plt.title("line chart")
plt.show()

#SCATTER PLOT
plt.scatter(range(len(x)),x,color='m',marker='d')
plt.title("scatter plot")
plt.show()

#HISTOGRAM 
plt.hist(x,color='black')
plt.title("Histogram")
plt.show()

#BOX PLOT
plt.boxplot(x,vert=False)
plt.title("Box Plot")
plt.show()

t=[50,60,70,80,90]
s=["os","fds","python","cpp","bc"]
plt.pie(t,labels=s)

plt.bar(s,t)
plt.show()
'''
#IRIS
iris=sns.load_dataset("iris")
s=iris['species'].value_counts()
sns.barplot(x=s.index,y=s.values)
plt.show()

iris=sns.load_dataset("iris")
s=iris['species'].value_counts()
sns.pie(x=s.index,y=s.values)
plt.show()

