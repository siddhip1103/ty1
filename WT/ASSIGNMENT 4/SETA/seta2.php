<?php
$a=$_GET["n1"];
$el=$_GET["n2"];
$ch=$_GET["op"];
$b=explode(",",$a);
echo "selected option is:" .$ch;
echo "<br>";
echo "<br>";

echo "Array elements are :";
foreach($b as $c)
     echo $c. "\t";
echo "<br>";
echo "<br>";

switch ($ch) {
      case 1:
           echo "Array with pushed elements is :";
           array_push($b,$el);
           break;
         case 2:
           echo "Array with popped elements is :";
           array_pop($b);
           break;
          case 3:
           echo "Content of stack is:";
           break;
            case 4:
           echo "Array with inserted elements is :";
           array_unshift($b,"$el");
           break;
            case 5:
           echo "Array with deleted elements is :";
           array_shift($b);
           break;
             case 6:
           echo "Content f queue is:";
           break;
}
foreach($b as $c)
       echo $c."\t";
?>
