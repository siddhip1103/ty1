import pandas as pd
import matplotlib.pyplot as plt
df=pd.DataFrame(columns=["name","age","percentage"])
df.loc [0]=["shreya",18,90]
df.loc [1]=["siddhi",19,95]
df.loc [2]=["tjal",18,96]
df.loc [3]=["shravani",18,98]
df.loc [4]=["anu",20,50]
df.loc [5]=["payal",21,77]
df.loc [6]=["jay",18,90]
df.loc [7]=["urvi",22,88]
df.loc [8]=["shalu",20,99]
df.loc [9]=["gauri",22,89]
print ("Dateframe is:",df)

print("shape of data:",df.shape)
print("number of rows and columns:",df.size)
print("data type:",df.dtypes)
print("description of data:",df.describe())

df.loc[10]=["sanchi",18,80]
df.loc [11]=["shravani",18,98]
df.loc [12]=["anu",20,50]
df.loc [13]=["payal",21,77]
df.loc [14]=["jay",18,90]
df.loc [15]=["jay",18,90]
df["remarks"]=None
print(df)
print(df.info())
print("number of observation =",df.info())
print("missing value=",df.isnull())
print("duplicate value=",df.duplicated())

df.drop(columns=["remarks gy
"],axis=1,inplace=True)
print(df)
print(df.dropna())

df.plot(x="name",y="percentage")
plt.title("line plot")
print(plt.show())

df.plot.scatter(x="name",y="percentage")
plt.title("line plot")
print(plt.show())

