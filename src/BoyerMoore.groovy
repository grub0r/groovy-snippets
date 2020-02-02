def next(j){
    if (j == "A") return 3
    if (j == "l") return 2
    if (j == "g") return 1
    return 4
}


def matchingBoyerMoore(p, S) {
    si = p.size() - 1
    pi = p.size() - 1
    while (si < S.size()) {
        if (p[pi] == S[si]) {
            if (pi == 0) return true
            pi = pi - 1
            si = si - 1
        }
        else {
            pi = p.size() - 1
            si = si + next(S[si])
        }
    }
    return false
}


print matchingBoyerMoore("Algo", "Das ist ein geiler Alg Algorithmus")