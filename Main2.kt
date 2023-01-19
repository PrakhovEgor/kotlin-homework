import java.util.ArrayList

fun main() {
    val m1 = Matrix(listOf(listOf(1, 2), listOf(3, 4)))
    val m2 = Matrix(listOf(listOf(10, 5), listOf(35)))
    val m3 = m1 + m2
    println(m3)

}

class Matrix(mat: List<List<Int>>) {
    val matrix = mat

    //    operator fun plus(matrix: Matrix) : Matrix{
//        val m1 = matrix
//        val m2 =
//    }
    operator fun plus(m: Matrix): Any {
        var temp: ArrayList<ArrayList<Int>> = ArrayList()
        if (matrix.size == m.matrix.size) {

            for (i in 0..matrix.size - 1) {
                temp.add(ArrayList<Int>())

                if (matrix[i].size == m.matrix[i].size) {
                    for (j in 0..matrix[i].size - 1) {
                        temp[i].add(matrix[i][j] + m.matrix[i][j])
                    }
                } else {
                    println("Операция сложения не была выполнена: Матрицы должны быть одинакового размерра")
                    return 0
                }
            }
            return temp
        }
        println("Операция сложения не была выполнена: Матрицы должны быть одинакового размерра")
        return 0
    }
    operator fun minus(m: Matrix): Any {
        var temp: ArrayList<ArrayList<Int>> = ArrayList()
        if (matrix.size == m.matrix.size) {

            for (i in 0..matrix.size - 1) {
                temp.add(ArrayList<Int>())

                if (matrix[i].size == m.matrix[i].size) {
                    for (j in 0..matrix[i].size - 1) {
                        temp[i].add(matrix[i][j] - m.matrix[i][j])
                    }
                } else {
                    println("Операция вычетания не была выполнена: Матрицы должны быть одинакового размерра")
                    return 0
                }
            }
            return temp
        }
        println("Операция вычетания не была выполнена: Матрицы должны быть одинакового размерра")
        return 0
    }



}



