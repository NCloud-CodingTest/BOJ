import math  # 수학 관련 함수들을 사용하기 위해 math 모듈을 임포트합니다.

# 주어진 숫자가 소수인지 확인하는 함수
def is_prime(n):
    if n <= 1:  # 숫자가 1 이하이면 소수가 아니므로 False를 반환합니다.
        return False
    if n == 2:  # 숫자가 2이면 소수이므로 True를 반환합니다 (2는 가장 작은 소수입니다).
        return True
    if n % 2 == 0:  # 숫자가 2가 아닌 짝수이면 소수가 아니므로 False를 반환합니다.
        return False
    sqrt_n = int(math.floor(math.sqrt(n)))  # 숫자 n의 제곱근을 구한 후 정수로 변환합니다.
    for i in range(3, sqrt_n + 1, 2):  # 3부터 제곱근까지의 홀수들로 나눠봅니다.
        if n % i == 0:  # n이 i로 나누어 떨어지면 소수가 아니므로 False를 반환합니다.
            return False
    return True  # 위의 조건을 모두 통과하면 소수이므로 True를 반환합니다.

t = int(input())  # 입력값을 받아 정수로 변환하여 t에 저장합니다.
x = list(map(int, input().split()))  # 입력값을 공백 기준으로 나누어 정수 리스트로 변환합니다.
primes = [num for num in x if is_prime(num)]  # 리스트 x에서 소수인 숫자들만 필터링하여 primes 리스트에 저장합니다.
print(len(primes))  # 소수의 개수를 출력합니다.
