def grades = [1, 2, 3, 4, 5]

//average
def sum = 0;
for (grade in grades) {

    sum += grade

}

average = sum / grades.size()


//deviation
sum = 0
for (grade in grades) {

    sum += (grade - average)**2

}

devitation = Math.sqrt(sum / grades.size())

println "average: " + average.toString()
println "deviation: " + devitation.toString()