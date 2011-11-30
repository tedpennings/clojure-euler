(defn primality-test [x] 
	(.isProbablePrime (BigInteger/valueOf x) 15))

(def is-prime primality-test)

(defn find-it []
	"Calculate the sum of all the primes below two million."
	(let [primes (filter is-prime (range 1 2000001))]
		(reduce + primes)))