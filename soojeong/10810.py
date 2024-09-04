const readline = require('readline');

// 입력을 받기 위한 인터페이스 설정
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// 입력을 저장할 배열
let input = [];

// 입력을 받는 부분
rl.on('line', (line) => {
  input.push(line);
}).on('close', () => {
  // 입력 처리 시작
  const [n, m] = input[0].split(' ').map(Number); // 첫 줄에서 n과 m을 추출
  let arr = Array(n).fill(0); // 배열을 0으로 채워 초기화
  
  for (let a = 1; a <= m; a++) {
    const [i, j, k] = input[a].split(' ').map(Number); // i, j, k를 입력받음
    
    // 스프레드 문법을 사용하여 범위에 k 값을 설정
    arr = [
      ...arr.slice(0, i - 1),  // i-1 이전의 배열 부분은 그대로 유지
      ...Array(j - i + 1).fill(k),  // i에서 j까지는 k로 채움
      ...arr.slice(j)  // j 이후의 배열 부분은 그대로 유지
    ];
  }

  // 배열 출력
  console.log(arr.join(' '));
});

