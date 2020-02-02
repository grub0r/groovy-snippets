int[] unsorted = [1, 5, 99, 66, 4, 7]

def switchInArray(int [] array, int indexA, int indexB) {
    tmpSaveA = array[indexA]
    array[indexA] = array[indexB]
    array[indexB] = tmpSaveA
    return array
}

for (int i = 0; i <= unsorted.size() - ((unsorted.size() % 2 == 0) ? 2 : 3 ); i=i+2) {
    indexMin1 = i
    indexMin2 = i+1
    min1 = unsorted[i]
    min2 = unsorted[i+1]
    for (int j = i; j < unsorted.size(); j++) {
        if (j == indexMin1) {
        } else {
            if (unsorted[j] <= min2) {
                min2 = unsorted[j]
                indexMin2 = j
            }
            if (unsorted[j] <= min1) {
                min2 = min1
                indexMin2 = indexMin1
                min1 = unsorted[j]
                indexMin1 = j
            }
        }
    }
    unsorted = switchInArray(unsorted, i, indexMin1)
    unsorted = switchInArray(unsorted, i+1, indexMin2)
}

if (unsorted.size() % 2 != 0)
{
    if (unsorted[unsorted.size()-1] < unsorted[unsorted.size()-2]) {
        unsorted = switchInArray(unsorted, unsorted.size()-1, unsorted.size()-2)
    }
}

sorted = unsorted
println(sorted)
