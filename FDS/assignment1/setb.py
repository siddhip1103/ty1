import pandas as pd
import matplotlib.pyplot as plt
df=pd.read_csv("SOCR-HeightWeight.csv")
df.head(10)
df.tail(10)
df.sample(20)
print(df)

print("shape of Dataframe:",df.shape)
print("size of Dataframe:",df.size)
print("data types:",df.dtypes)
print("statistical Data:",df.describe())
print("number of obsertation:",df.info())
print("missing values",df.isnull())
df["BMI"]=(df["Weight(Pounds)"]/(df["Height(Inches)"]**2))
print(df)

df.plot.scatter(x="Height(Inches)",y="Weight(Pounds)")
plt.title("Scatter Diagram")
print(plt.show())
