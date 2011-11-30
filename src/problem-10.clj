(def prime-certainty 15)

(defn is-prime [x] 
	(.isProbablePrime (BigInteger/valueOf x) prime-certainty))

(defn find-it []
	"Calculate the sum of all the primes below two million."
	(let [primes (filter is-prime (range 1 2000001))]
		(reduce + primes)))