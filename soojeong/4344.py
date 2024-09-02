import sys
C = int(sys.stdin.readline().rstrip())
for i in range(C):
    N = list(map(int, sys.stdin.readline().split()))
    avg = sum(N[1:])/N[0]
    cnt = 0
    for j in range(1, len(N)):
        if N[j] > avg:
            cnt += 1
    print(f'{cnt/N[0]*100:.3f}%')
