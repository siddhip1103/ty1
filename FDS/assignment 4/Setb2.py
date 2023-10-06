from pandas import*
from numpy import*
from matplotlib.pyplot import*
df=read_csv("Iris.csv")
data1=df["SepalLengthCm"]
data2=df["SepalWidthCm"]
scatter(data1,data2)
show()
