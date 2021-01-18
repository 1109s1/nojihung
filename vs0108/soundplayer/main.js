
    
       
       // window 객체는 웹브라우저 전체를 의미한다고 보면 된다.
    // 많이 쓰이는건 document 객체를 많이 씀
       window.addEventListener('load', function() {
            //NodeList 객체(array가 아니다)에 선택된 모든 노드를 담는다.
            const sounds = document.querySelectorAll(".sound");
            const pads = document.querySelectorAll(".pads div");
            //console.log(sounds);
            const visual = document.querySelector('.visual');
            const title = document.querySelector(".title")
            const colors = [
                "lightseagreen",
                "rgb(178, 32, 112)",
                "rgb(214, 141, 30)",
                "rgb(64, 55, 196)",
                "rgb(4, 184, 13)",
                "rgb(216, 55, 189)"
            ]

            //재생되는 음악이 끝나면 visual에서 비주얼과 제목을 제거
            sounds.forEach(snd => {
                snd.onended = function(){
                    visual.innerHTML = "";
                    title.innerHTML = "";
                };
            });

            pads.forEach((pad, index) => {
                pad.addEventListener('click', function(){
                    //기존에 재생되는 음악을 중지 시켜야 한다.
                   sounds.forEach(inx => {
                    //console.log(inx);
                    inx.pause();
                   });
                   if(sounds[index]){
                    sounds[index].currentTime = 0;
                    sounds[index].play();

                    //뮤직 제목을 출력해 준다.
                    //console.log(sounds[index].src) ;






                    
                    const strArray = sounds[index].src.split("sound/");
                    title.innerHTML = strArray[1];
                   }
                   
                    //볼만들고 애니메이션 하기
                    createBubbles(index);
                });
            });

            const createBubbles = function(index)
            {
              
                visual.innerHTML = "";
                // div 태그 생성
                const bubble = document.createElement("div");
                //visual 태그 안에 div 태그 하나 집어넣는다.
                visual.appendChild(bubble);
                bubble.style.backgroundColor =  colors[index];
                bubble.style.top = '300px';
                bubble.style.animation = 'animation 2000ms linear infinite both';
            }

        });
