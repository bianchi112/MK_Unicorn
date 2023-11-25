document.addEventListener('DOMContentLoaded', function () {
    let idInput = document.querySelector('.t2 input[type="text"]');
    let pwInput = document.querySelector('.t2 input[type="password"]');
    let idMessage = document.getElementById('id1');
    let pwMessage = document.getElementById('pw1');
    let login = document.getElementById('.login-input');



    // 엔터 키를 누르면 다음 입력 필드로 이동하도록 설정
    idInput.addEventListener('keydown', function (event) {
        if (event.key == 'Enter') {
            event.preventDefault(); // 엔터 키의 기본동작을 막음
            pwInput.focus(); // 비밀번호 입력 필드로 포커스 이동
        }
    });

    pwInput.addEventListener('focus', function () { // 비밀번호 입력 필드를 선택(포커스)했을때
        let input1 = document.querySelector(".id-input")
        if (idInput.value == '') { // 아이디 입력 필드가 빈값이면
            idMessage.style.visibility = 'visible'; // 아이디는 필수입니다 보이게 설정
            input1.style.border = "1px solid red"; // 아이디 입력필드 빨간색 테두리 효과
        } else {
            // let input1 = document.querySelector(".id-input")
            idMessage.style.visibility = 'hidden'; // 아니면 안보이게 설정
            input1.style.border = "1px solid gray"; // 아이디 입력필드 검정색 테두리 효과
        }
    });

    idInput.addEventListener('focus', function () { // 아이디 입력 필드를 선택(포커스)했을때
        if (idInput.value !== '') { // 아이디 입력 필드가 빈값이 아니면
            input1.style.display = 'none'; // 테두리효과 안보이게 설정
        }
    });

    pwInput.addEventListener('!focus', function () { // 비밀번호 입력필드에서 포커스를 잃었을때
        pwMessage.style.visibility = 'hidden'; // 비밀번호는 필수입니다 안보이게 설정
        // let input1 = document.querySelector(".id-input")
        //   input1.style.border = "1px solid red"
    });

    document.querySelector('.login-input').addEventListener('focus', function () { // 로그인버튼 선택시
        let input2 = document.querySelector(".pw-input")
        if (pwInput.value == '') { // 비밀번호 입력 필드가 빈값이면
            pwMessage.style.visibility = 'visible'; // 비밀번호는 필수입니다 보이게 설정
            input2.style.border = "1px solid red"; // 아이디 입력필드 빨간색 테두리 효과
        } else {
            pwMessage.style.visibility = 'hidden'; // 아니면 안보이게 설정
            input2.style.border = "1px solid gray"; // 아이디 입력필드 검정색 테두리 효과
        }
    });

    document.querySelector('.login-input').addEventListener('focus', function () { // 로그인버튼 선택시
        let input1 = document.querySelector(".id-input")
        if (idInput.value == '') { // 아이디 입력 필드가 빈값이면
            idMessage.style.visibility = 'visible'; // 아이디는 필수입니다 보이게 설정   
            input1.style.border = "1px solid red"; // 아이디 입력필드 빨간색 테두리 효과
        } else {
            idMessage.style.visibility = 'hidden'; // 아니면 안보이게 설정
            input1.style.border = "1px solid gray"; // 아이디 입력필드 검정색 테두리 효과
        }
    });

    let idvalue = "human123";              // 아이디값 저장
    let pwvalue = "human123";             // 비밀번호값 저장

    document.querySelector('.login-input').addEventListener('click', function () { // 로그인버튼 선택시
        let id = document.querySelector(".id-input");
        let pw = document.querySelector(".pw-input");
        let message = document.querySelector(".message");

        if (id.value == '' || pw.value == '') {     // 아이디입력필드가 빈값이거나 비밀번호입력필드가 빈값이면
            message.style.visibility = "hidden";    // 메세지 숨김

            // 아이디 입력필드가 저장한값과 같거나 비밀번호 입력필드가 저장한값과 같으면 
        } else if (id.value == idvalue && pw.value == pwvalue) {
            window.location.href = "윤여준_main_logout.html"       // 메인페이지로 이동 (로그인성공)

            // 비밀번호 입력필드가 저장한값과 다르거나 비밀번호 입력필드가 저장한값과 다르면
        } else if (id.value != idvalue && pw.value != pwvalue) {
            message.style.visibility = "visible";           // 메세지 보여줌
        }

    });

});