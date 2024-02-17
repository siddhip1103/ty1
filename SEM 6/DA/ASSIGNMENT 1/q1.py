import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression

df=pd.read_csv("advertising.csv")
print(df)
#check null values
print(df.isnull().sum())
#independent Var
X=np.array(df[['TV']])
y=np.array(df[['Sales']])
#split ddata into train testing set
X_train,X_test,y_train,y_test=train_test_split(X,y,test_size=.30,random_state=15)
reg=LinearRegression()
reg.fit(X_train,y_train)
y_pred=reg.predict(X_test)
print(y_pred)

#plot dataset
plt.scatter(X_train,y_train,color="blue")
plt.plot(X_train,reg.predict(X_train),color="red",linewidth=3)
plt.title("TV Vs Sales")
plt.xlabel("TV")
plt.ylabel("Sales")
plt.show() 
