from pandas import*
from numpy import*
import seaborn as sns
from matplotlib.pyplot import*
df=read_csv("Iris.csv")
sns.boxplot(x=df["Species"],y=df["SepalLengthCm"],palette="Blues")
show()
