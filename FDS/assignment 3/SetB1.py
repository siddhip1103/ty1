
from pandas import*
from numpy import*
from sklearn import preprocessing
import scipy.stats as s

df=read_csv("file:///data/ty32/TYBCS-32/FDS/Assignment%20No-3/winequality-red.csv");
print(df)

print("Rescaling Data")
print("\nData scaled between 0 to 1")
data_scaler=preprocessing.MinMaxScaler(feature_range=(0,1))
data_scaled=data_scaler.fit_transform(df)
print("\nMin Max Scaled data")
print("------------------------------")
print(data_scaled.round(2))

print("\nStandardizing data")
arr=array(df)
print(arr)
print("\n initial mean=",s.tmean(arr).round(2))
print("\n initial standard devetion=",round(arr.std(),2))
x_scaled=preprocessing.scale(arr)
x_scaled.mean(axis=0)
x_scaled.std(axis=0)
print("\n standardizing data =\n",x_scaled.round(2))
print("\n scaling mean=",s.tmean(x_scaled).round(2))
print("\n scaling standard deviation :=",round(x_scaled.std(),2))

dn=preprocessing.normalize(df,norm='l1')
print("\n L1 Normalize Data")
print("------------------------------")
print(dn.round(2))

data_binarized=preprocessing.Binarizer(threshold=5).transform(df)
print("\n Binarized Data")
print("------------------------------")
print(data_binarized)


