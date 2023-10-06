from pandas import*
from numpy import*
from matplotlib.pyplot import*
df=read_csv("Iris.csv")
data1=df["PetalLengthCm"]
data2=df["PetalWidthCm"]
scatter(data1,data2)
show()
