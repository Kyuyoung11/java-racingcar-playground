## 문자열 덧셈 계산기
[기능목록]
1. 문자열 입력
2. 문자열 분리  
   2-1. 쉼표 또는 콜론을 구분자  
   2-2. 커스텀 구분자
   * 숫자 이외의 값 또는 음수이면 -> RuntimeException 예외 Throw
3. 합 계산  

<br/>
<br/>

---
## 자동차 경주 게임 
[기능 목록]
1. 각 자동차 이름 부여 - InputView#getCarsName
   * 자동차 이름 5자 초과 불가능
   * 자동차 이름은 쉼표를 기준으로 구분  
2. 시도할 횟수 입력 - InputView#getTryNumber
3. [시도 횟수 만큼 loop] 자동차 전진 - CarRacingGenerator#moveCars  
   3-1. 랜덤 값 구하기 - CarRacingGenerator#getMoveNumber  
   3-2. 4 이상이면 전진 - CarRacingGenerator#moveCarForward  
   * 랜덤 0~9 값 구하고, 4 이상이면 전진. 
4. 우승한 자동차 출력 - ResultPrinter#printWinner
   * 한 명 이상일 수 있다.

---

## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
