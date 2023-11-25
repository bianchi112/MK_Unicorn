// JavaScript 코드로 댓글 추가를 처리합니다.
document.getElementById("addCommentButton").addEventListener("click", function () {
    var commentInput = document.getElementById("commentInput").value; // 입력된 댓글 가져오기
    var commentDisplay = document.getElementById("commentDisplay"); // 댓글 표시 영역 가져오기

    // 새로운 div 엘리먼트 생성
    var newCommentDiv = document.createElement("div");
    newCommentDiv.classList.add("commentDiv"); // 주황색 보더 스타일 클래스 추가

    // 새로운 div에 입력된 댓글 추가
    var newComment = document.createElement("p");
    newComment.textContent = commentInput;
    newCommentDiv.appendChild(newComment);

    // 답글 입력 필드 생성
    var replyInput = document.createElement("input");
    replyInput.classList.add("replyInput");
    replyInput.type = "text";
    replyInput.placeholder = "답글을 입력하세요.";
    newCommentDiv.appendChild(replyInput);

    // "답글쓰기" 버튼 생성
    var replyButton = document.createElement("button");
    replyButton.classList.add("replyButton");
    replyButton.textContent = "답글쓰기";
    newCommentDiv.appendChild(replyButton);

    // 답글쓰기 버튼 클릭 이벤트 처리
    replyButton.addEventListener("click", function () {
        var replyText = replyInput.value;
        if (replyText) {
            var replyDiv = document.createElement("div");
            replyDiv.textContent = replyText;
            newCommentDiv.appendChild(replyDiv);
            replyInput.value = ""; // 입력 필드 초기화
        }
    });

    // 새로운 div를 댓글 표시 영역에 추가
    commentDisplay.appendChild(newCommentDiv);

    // 입력 필드 초기화
    document.getElementById("commentInput").value = "";
});

// <main head>
//logo
var text = document.querySelector(".typing .text");
var letters = [
    "Human",
];
// 글자 입력 속도
var speed = 100;
let i = 0;
// 타이핑 효과
var typing = async () => {
    var letter = letters[i].split("");
    while (letter.length) {
        await wait(speed);
        text.innerHTML += letter.shift();
    }
    // 잠시 대기
    await wait(3200);
    // 지우는 효과
    remove();
}
// 글자 지우는 효과
var remove = async () => {
    var letter = letters[i].split("");
    while (letter.length) {
        await wait(speed);
        letter.pop();
        text.innerHTML = letter.join("");
    }

    // 다음 순서의 글자로 지정, 타이핑 함수 다시 실행
    i = !letters[i + 1] ? 0 : i + 1;
    typing();
}

// 딜레이 기능 ( 마이크로초 )
function wait(ms) {
    return new Promise(res => setTimeout(res, ms))
}

// 초기 실행
setTimeout(typing, 1000);

// logo end

window.addEventListener("load", function () {
    bind();
})
function bind() {
    console.log("check")
    for (let i = 1; i < 5; i++) {
        let button = document.querySelector("[name='buttonsub_" + i + "']");
        let category = document.querySelector("#category .category_" + i);

        // 하위버튼 마우스오버 상태에서 마우스 빼도 안 사라지는 것 방지(사라지게)
        button.addEventListener("mouseover", function () {
            console.log("mouseover");
            category.style.display = "block";
        });
        button.addEventListener("mouseout", function () {
            console.log("mouseout");
            category.style.display = "none";
        });
        // 버튼에서 바로 마우스 빼면 사라짐. 하위버튼으로 마우스오버해도 사라지지 않게
        category.addEventListener("mouseover", function () {
            console.log("category mouseover");
            category.style.display = "block";
        });
        category.addEventListener("mouseout", function () {
            console.log("category mouseout");
            category.style.display = "none";
        });
    }
}
// 버튼 마우스오버 이벤트 끝 

// 스크롤 이벤트
window.addEventListener("scroll", function () {
    let head = document.querySelector("#head");
    let category = document.querySelector("#category");
    let button = document.querySelector(".button");

    if (window.scrollY > 10) {
        head.style.transform = "translateY(-80%)";
        category.style.paddingTop = "45px";
    } else {
        head.style.transform = "translateY(0)";
        category.style.paddingTop = "230px";
    }
});

// <링크>
// 메인
document.querySelector(".logo").addEventListener("click", function () {
    console.log("click")
    window.location.href = "윤여준_main.html";
});

// 만경(좌석)
document.querySelector(".tmp4").addEventListener("click", function () {
    console.log("click")
    window.location.href = "최만경_seat.html"
});
// 인혜(강의실)
document.querySelector(".tmp5").addEventListener("click", function () {
    console.log("click")
    window.location.href = "이인혜_class_board.html"
});
// 여준(맛집)
document.querySelector(".tmp3").addEventListener("click", function () {
    console.log("click")
    window.location.href = "윤여준_place.html"
});
document.querySelector(".tmp2").addEventListener("click", function () {
    console.log("click")
    window.location.href = "이인혜_notice_list.html"
});


// <main head end>