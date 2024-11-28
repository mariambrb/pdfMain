fun main(){
var answer=""
    do{
        print("insert value of X:")
        var x=readLine()
        print("insert value of Y:")
        var y=readLine()
        var fixedX=x?.filter { it.isDigit()}?.toIntOrNull()?:0
        var fixedY=y?.filter { it.isDigit()}?.toIntOrNull()?:0

        if(fixedY!=0){
            var z=fixedX.toFloat()/fixedY.toFloat()
            println("${fixedX} divided by ${fixedY} = ${if (z % 1==0f)z.toInt()else z}")
        }else{
            println("can't divide by 0")
        }
    do{ print("insert Y/N only!")
        var yesOrNo=readLine()?.toUpperCase()

        if(yesOrNo=="Y"){
          answer = yesOrNo
        }
       else if ( yesOrNo == "N"){
        println("The End")
       }
       }while( answer!="Y" && answer!="N")


    }while(answer=="Y")
}









