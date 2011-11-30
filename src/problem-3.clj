(defn test-primality [x]
	(.isProbablePrime (BigInteger/valueOf x) 100))
	
(def is-prime 
	(memoize test-primality))
	
