      // document 객체 API를 호출하여 버튼 요소의 참조를 반환받음.
      let myBtn = window.document.getElementById("myBtn");
      let yourBtn = window.document.getElementById("yourBtn");
      let numP = document.getElementById("num");
      let num = 0;
      // console.table(myBtn);
      myBtn.addEventListener("click", function (e) {
          console.log("이벤트 발생확인");
          num++;
  
          numP.textContent = num;
      });
  
      yourBtn.addEventListener("click", (e) => {
          num--;
  
          numP.textContent = num;
      });