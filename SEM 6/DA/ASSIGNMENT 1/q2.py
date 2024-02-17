import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression

df=pd.read_csv('Real estate.csv')
print(df)
#check null values
print(df.isnull().sum())
#independent Var
X=df.iloc[:,[2,3,4,5,6]].values
y=df.iloc[:,[7]].values
#split ddata into train testing set
X_train,X_test,y_train,y_test=train_test_split(X,y,test_size=.20,random_state=15)
reg=LogisticRegression()
reg.fit(X_train,y_train)
y_pred=reg.predict([[32,84.87882,10,24.98298,121.54024]])
print("\n predicted values is \n")
print(y_pred)
#plot dataset
'''
plt.scatter(X_train,y_train,color="blue")
plt.plot(X_train,reg.predict(X_train),color="red",linewidth=3)
plt.title("House Vs price")
plt.xlabel("house")
plt.ylabel("price")
plt.show()'''
