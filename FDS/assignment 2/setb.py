#1
import pandas as pd
from matplotlib.pyplot import*
df=pd.read_csv('Iris(1).csv')

print(df)
'''
#1
#print(df.sample(20))
print("Max of SepelLength : ",max(df["SepalLengthCm"]))
print("Max of petelLength : ",max(df["PetalWidthCm"]))
print("Min of SepelLength : ",min(df["SepalLengthCm"]))
print("Min of petelLength : ",min(df["PetalWidthCm"]))
print("\n")
'''
'''
#2
print("Number of records of distinct value of class attribute is : \n")
print (df["Species"].value_counts())
print("\n")
'''
#3
MeanS=df["SepalLengthCm"].mean().round(2)
print("Mean of class attributr SepalLengthCm is : ",MeanS)

MeanP=df["PetalWidthCm"].mean().round(2)
print("Mean of class attributr petalLengthCm is : ",MeanP)

MedS=df["SepalLengthCm"].median().round(2)
print("Median of class attributr SepalLengthCm is : ",MedS)

MedP=df["PetalWidthCm"].median().round(2)
print("Median  of class attributr petallLengthCm is : ",MedP)
