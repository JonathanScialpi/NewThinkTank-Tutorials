/**
 * Created by Jonathan Scialpi on 4/11/2017.
 */
class GroovyTut{
    static void main(String[] args){
        println("Hello World")
/*
        def age = "Dog"
        age = 40

        println("5+4= " + (5+4))
        println("5-4= " + (5-4))
        println("5*4= " + (5*4))
        println("5/4= " + (5.intdiv(4)))
        println("5%4= " + (5%4))

        // floating
        println("5.2+4.4= " + (5.2.plus(4.4)))
        println("5.2-4.4= " + (5.2.minus(4.4)))
        println("5.2*4.4= " + (5.2.multiply(4.4)))
        println("5.2/4.4= " + (5.2/4.4))
        println("5.2%4.4= " + (5.2.plus(4.4)))

        println("3+2*5 = " + (3+2*5))
        println("(3+2)*5 = " + ((3+2)*5))

        println("age++" + (age++))
        println("++age" + (++age))
        println("age--" + (age--))
        println("--age" + (--age))

        println("Biggest Int " + Integer.MAX_VALUE)
        println("Smallest Int " + Integer.MIN_VALUE)
        println("Biggest Double " + Double.MAX_VALUE)
        println("Smallest Double " + Double.MIN_VALUE)
        println("Biggest Long " + Long.MAX_VALUE)
        println("Smallest Long " + Long.MIN_VALUE)*/

        //some math operations
        /*
        def randNum =2.0
        println("Math.abs(-2.45) "+ (Math.abs(-2.45)))
        println("Math.round(-2.45) "+ (Math.round(2.45)))
        println("randNum.pow(3) "+ (randNum.pow(3)))
        println("3.0.equals(2.0) "+ (3.0.equals(2.0)))
        println("randNum.equals(Float.NaN "+ (randNum.equals(Float.NaN)))
        println("Math.sqrt(9) "+ (Math.sqrt(9)))
        println("Math.cbrt(27) "+ (Math.cbrt(27)))
        println("Math.ceil(2.45) "+ (Math.ceil(2.45)))
        println("Math.floor(2.45) "+ (Math.floor(2.45)))
        println("Math.min(2,3)"+Math.min(2,3))
        println("Math.max(2,3)"+Math.max(2,3))*/

        //random number
        // println("Math.abs( new Random().nextInt() % 100) = "+ Math.abs( new Random().nextInt() % 100) + 1)

        //String work
       // def name = "Jonathan"
        /*println('I am ${name}\n')
        println("I am ${name}\n")
        def multString = '''I am
a String
that goes on
form many lines'''
        println(multString)
        println("3rd Index of Name " + name[3])
        println("Index of r " +  name.indexOf('t'))
        println("1st 3 chars " +  name[0..2])
        println("Every other character " + name[0,2,4])
        println("Substring at 1 " + name.substring(1))
        println("Substring at 1 to 4 " + name.substring(1,4))
        println("My Name " + name)
        println("Concat ".concat(name))
        println("Hello world " *3)
        println("ignoreCase " + "Hello".equalsIgnoreCase("hello"))
        def repeatString = "I went to the store"
        println(repeatString - "store")
        println(repeatString.toList())
        println('Anyt' <=> 'Banana')*/

        //output
        /*
        def randString = "Random"
        println("A $randString string")
        printf("A %s string \n", randString)
        printf("%-10s %d %.2f %10s \n",['Stuff',10,1.234,'Random'])*/

        //list operations

        /*def primes = [2,3,5,7,11,13]
        println(primes[1])
        println("Size of primes = " + primes.size())

        def employee = ['Derek'  ,40, 6.25, [1,2,3]]
        println("2nd number " + employee[3][1])

        primes.add(17)
        primes<<19
        primes.add(23)
        primes + [29,31]
        primes - 31
        println("IS Empty " + primes.isEmpty())
        println("1st 3 " + primes[0..2])
        println(primes)
        println("Matches " + primes.intersect([2,3,7]))
        println("Reverse or sort " + primes.reverse())
        println("Pop off last " + primes.pop())*/

        //fun with maps
        /*
        def paulMap = ['name' : 'Paul', 'age':35,'address':'123 Main St','list':[1,2,3]]

        println("Name " + paulMap['name'])
        println("Name " + paulMap.get('age'))
        println("List Item " + paulMap['list'][1])

        paulMap.put('city', 'Pittsburg')
        println("Has City " + paulMap.containsKey('city'))
        println("Size " + paulMap.size())*/

        //fun with ranges
        /*def oneTo10 = 1..10;
        def aToZ = 'a'..'z'
        def zToA = 'z'..'a'
        println(oneTo10)
        println(aToZ)
        println(zToA)
        println("size of oneTo10 " + oneTo10.size())
        println("second value in range " + oneTo10.get(1))
        println("contains: " + oneTo10.contains(20000))
        println("Get Last " + oneTo10.getTo())
        println("Get First " +  oneTo10.getFrom())*/

        //LOOPING
        /*
        def custs = [
                100: "Paul",
                101: "Sally",
                102: "Sue"
        ]
        for(cust in custs){
            println("$cust.value : $cust.key")
        }*/
        sayHello();
        println(getSum(5,4))

        def myName = "Jonathan"

       passByValue(myName)
       println(myName)

        def listToDouble = [1,2,3,4]
        listToDouble = doubleList(listToDouble)
        println(listToDouble)

        def nums = sumAll(1,2,3,4)
        println("Sum : " +  nums)

        def fact4 = factorial(4)
        println(fact4)

        def closure = {num -> num <=1 ? 1 : num * call(num-1) }
        println(closure(4))

        def greeting ="goodbye"
        def sayGoodBye = {theName -> println("$greeting $theName")}
        sayGoodBye("Jonathan")

        def randNums  = [1,2,3,4,5,6]
        randNums.each {num -> if(num%2==0){
            println(num)
        }}

        def namelist=["Doug","Sally","Sue"]
        def matchEle = namelist.find {item -> item == "Sue"}
        println(matchEle)

        def king = new Animal('King','Growl')
        println("$king.name says $king.sound")
        king.setSound('Grrrrr')
        println("$king.name says $king.sound")
        king.run()
        println(king.toString())
    }

    static def factorial(num){
        if(num<=1){
            return 1;
        }else{
            return (num * factorial(num - 1))
        }
    }

    static def sumAll(int... num){ // 3 dots to represent an argument of an unknown amount of ints
        def sum = 0;
        num.each { sum += it}
        return sum
    }

    static def sayHello(){
        println("Hello")
    }

    static def getSum(num1=0,num2=0){
        return num1+ num2;
    }

    static def passByValue(name){
        name = "In Function"
        println("Name : " + name)
    }

    static def doubleList(list){
        def newList = list.collect { it *2}
        return newList
    }
}
