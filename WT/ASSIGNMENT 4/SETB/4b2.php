<?php
$a=$_GET["n1"];
$el=$_GET["n2"];
$b=explode(",",$a);
$cn=count($b);
//dusplay array elements
echo "Array elements are :";
foreach($b as $c)
echo $c."\t";
echo "<br>";
// search an element
//$k=array_key_exists($el,$b);
for ($i=0;$i<$cn;$i++)
{
    if($b[$i]==$el)
    {
        echo $el. "  exist in array...";
        return;
    }
}
echo $el. "  is not exist in array...";
echo "<br>";
?>
