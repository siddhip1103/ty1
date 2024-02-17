import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression

df=pd.read_csv('Iris.csv')
print(df)
#check null values
#print(df.isnull().sum())
#independent Var
X=df.iloc[:,[1]].values
y=df.iloc[:,[5]].values
#split ddata into train testing set
X_train,X_test,y_train,y_test=train_test_split(X,y,test_size=0.30,random_state=25)
reg=LogisticRegression()
reg.fit(X_train,y_train)
y_pred=reg.predict(X_test)
#print("\n predicted values is \n")
print(y_pred)

