"use strict";

const btn = document.querySelector("#button");

btn.addEventListener("click", () => {
    let bucketCnt = prompt("바구니 개수를 입력하세요.");
    let arr;
    (arr = []).length = bucketCnt;
    arr.fill(0);
    console.log(arr);

    let changetNumCnt = prompt("공을 넣을 횟수를 입력하세요.");

    for (let i = 0; i < changetNumCnt; i++) {
        let changeStartNum = prompt("공을 바꿀 위치의 시작 번호를 입력해주세요.");
        let changeEndNum = prompt("공을 바꿀 위치의 마지막 번호를 입력해주세요.");

        let removeNum = changeEndNum - changeStartNum;

        let changeNum = prompt("공을 바꿀 번호를 입력해주세요.");

        let addNum = Array(removeNum + 1).fill(changeNum);

        if (arr[i] === undefined && arr[i] === null) {
            let add = Array(removeNum + 1).fill(changeNum);
            arr.push(...add);
        } else {
            arr.splice(changeStartNum, removeNum, ...addNum);
        }
    }

    console.log(arr);

    // for(let i = 0; i < arr.length; i++) {
    //     let input = prompt("")
    // }
});

/** prompt 함수: 팝업창을 띄어 사용자 입력값을 받을 수 있는 함수이다.
 *  comfirm 함수: 별도의 팝업창에서 확인,취소 두 가지 옵션을 주어 사용자로부터 true,false 값을 리턴 받는 함수이다.
 *  unshift 함수: 배열에 첫 번째 인덱스에 요소를 삽입하는 함수
 *  push 함수: 배열에 마지막 인덱스에 요소를 삽입하는 함수
 *  splice 함수: 배열에 특정 인덱스에 요소를 삽입하는 함수, start: 배열 변경을 시작할 인덱스, deleteCount: 제거할 요소의 수, item: 배열에 추가할 요소
 *   ex) var friends = [“영희", "철수", "민호"];
 *       friends.splice(2, 0, "민지");
 *       console.log(friends); // ["영희, "철수", "민지", "민호"]
 *
 */
