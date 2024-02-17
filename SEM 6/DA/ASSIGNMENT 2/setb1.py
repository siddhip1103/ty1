import io
import pandas as pd
from mlxtend.frequent_patterns import apriori, association_rules
data=pd.read_csv('mbo.csv')
print(data)
df=data.sample(50)
print(df)
transaction-[]
for i in range(0,len(df)):
   transaction.append([str(df.values[i,j])]) for j in range(0,20) if str (data.values[i,j])!='nan'])
