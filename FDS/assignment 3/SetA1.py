import pandas as pd
import matplotlib.pyplot as plt
df=pd.read_csv("data.csv");
print(df)
print("\nDescribing the dataset\n:",df.info())
print("\nDescribing the dataset\n:",df.describe())
print("Shape of the dataset : ",df.shape)
print("Display first 3 rowa from dataset: \n",df.head(3))

print(df.isnull())
print("\nMissin Value :",df.fillna(0,inplace=True))
print(df)
print("\nDrop Rows Having Value 0:\n",df.dropna())
Mean=df['Age'].mean()

df['Age'].fillna(Mean,inplace=True)
print(df)
Mean=df['Salary'].mean()
print(Mean)
df['Salary'].fillna(Mean,inplace=True)

