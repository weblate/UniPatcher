## 자주 묻는 질문:

#### 유니패처란 무엇입니까?

유니패처는 다양한 비디오 게임 콘솔의 롬 이미지에 패치를 적용하는 안드로이드 도구입니다.

#### 어떤 패치 형식이 지원됩니까?

이 앱은 IPS, IPS32, UPS, BPS, APS (GBA), APS (N64), PPF, DPS, EBP 및 XDelta3 패치를 지원합니다.

#### 이 앱을 사용하여 안드로이드 게임을 해킹 혹은 크래킹할 수 있습니까?

아니요. 유니패처는 안드로이드 게임을 해킹하도록 설계되지 않았습니다.

#### 롬 이미지란 무엇입니까?

롬 이미지는 비디오 게임 카트리지의 사본을 포함하는 컴퓨터 파일입니다. 에뮬레이션 프로세스를 통해 파일을 복사하고 "에뮬레이터"라는 소프트웨어로 실행하여 컴퓨터 또는 스마트폰으로 게임을 즐길 수 있습니다.

#### 롬 해킹이란 무엇입니까?

롬 해킹은 롬 이미지의 데이터를 수정하는 것입니다. 이는 그래픽 변경, 게임 레벨 변경, 난이도 조정, 게임이 원래 제공되지 않은 언어로의 번역 등의 형태를 취할 수 있습니다.

#### 패치란 무엇입니까?

패치는 원래 버전의 롬과 해킹된 버전 간의 차이가 포함된 파일입니다.

패치가 배포되면, 사용자는 플레이 가능한 버전의 해킹을 생성하는 원본 롬 복사본에 패치를 적용합니다.

#### 어째서 롬 해커가 수정된 게임을 배포하지 않습니까?

해킹 및 번역은 일반적으로 다운로드 크기를 줄이고 저작권 문제를 피하기 위해 패치로 배포됩니다.

#### 롬에 패치를 적용하는 방법은 무엇입니까?

롬 파일과 패치를 선택하고 붉은색 둥근 버튼을 탭하면 됩니다.

결과적으로 원본 롬과 동일한 디렉터리에 패치된 롬이 생성됩니다.

#### 파일 선택 후 앱에 메시지가 표시됩니다: "압축 파일은 외부 프로그램에서 압축을 풀어야 합니다".

선택한 파일이 압축 파일입니다. 압축 파일에는 디렉터리와 파일이 압축된 형식으로 포함됩니다.

현재 유니패처는 압축 파일을 풀 수 없으므로 다른 프로그램에서 압축 파일의 압축을 풀어야 합니다. 무료 프로그램 [ZArchiver](https://play.google.com/store/apps/details?id=ru.zdevs.zarchiver)를 권장합니다.

#### 앱에 오류가 표시됩니다: "이 롬은 패치와 호환되지 않습니다".

패치에 저장된 체크섬이 롬의 체크섬과 일치하지 않으면 앱에 이 오류가 표시됩니다. 이것은 롬이 패치와 호환되지 않음을 의미합니다. 다른 롬을 선택해야 합니다. 일반적으로 각 게임에 대해 여러 개의 롬이 있습니다 (예: 유럽, 미국, 일본 버전, 양호 또는 불량 덤프 등).

롬 해커는 종종 첨부된 롬 파일의 체크섬을 게시합니다 (웹페이지 또는 README 파일에 있음). 당신이 가지고 있는 것과 그것을 비교하십시오. 파일 관리자에서 파일을 길게 누르면 CRC32, SHA1 및 MD5와 같은 세 줄이 표시됩니다. 그 숫자 중 하나가 같으면 패치가 작성된 롬이 있는 것입니다. 그렇지 않다면 다른 롬이 필요합니다.

최악의 경우에는, 만약 여러분이 재대로된 롬 파일을 찿을수 없다면, 여러분은 설정에서 "체크섬 무시" 를 선택할수 있습니다. 하지만 명심하세요! 이 경우에는 게임이 버그를 일으킬수 있거나 완전히 맛이 갈수도 있습니다.

#### I can't patch "Super Mario World (U) [!].smc"

This ROM contains an SMC header, while most patches for this game require the ROM to not have this header. You can remove SMC header by selecting the appropriate item in the menu on the left and then apply the patch to the resulting ROM.

#### 게임 "포켓몬스터 에메랄드"에 맞는 롬을 찾을 수 없습니다.

게임 패치 대부분은 "Pokemon - Emerald Version (U) \[f1\] (Save Type).gba"와 같은 롬에 작동합니다.

#### IPS 패치를 적용한 다음 게임이 작동하지 않거나 그래픽 결함이 있습니다. 내가 뭘 잘못한 겁니까?

IPS 형식 패치에는 체크섬이 없습니다. 따라서 이 패치는 임의의 롬에도 적용됩니다. 이 경우 다른 롬을 찾아야 합니다.

#### .ECM 파일 유형으로 무엇을 할 수 있습니까?

ECM은 디스크 이미지를 위해 특별히 고안된 데이터 압축 형식입니다. [ZArchiver](https://play.google.com/store/apps/details?id=ru.zdevs.zarchiver) 프로그램을 사용하여 파일의 압축을 풀 수 있습니다.

#### 유니패처에 다른 추가 기능이 있습니까?

예. 유니패처는 다음이 가능합니다:

- XDelta3 패치 생성.
- 세가 메가 드라이브/세가 제네시스 게임 체크섬 수정.
- Remove SMC header in Super Nintendo games.

#### 세가 메가 드라이브 게임의 체크섬을 수정해야 하는 이유는 무엇입니까?

세가 메가 드라이브(제네시스)게임들은 그들의 체크섬을 롬에 기록한다. 만역 너가 게임의 일부를 수정하고 싶다면, 그것들은 매칭이 않될것이고 결국 실행에 실패할 것이다. 이것은 변경사항의 정확한 체크섬을 계산하여 수정된 ROM 파일에 쓸 것이다."

**경고:** 이 기능은 백업을 생성하지 않습니다.

#### Why is it sometimes necessary to remove SMC headers from Super Nintendo games?

An SMC header is 512 bytes found at the start of some SNES ROM images. These bytes have no purpose, but they change the location of the remaining data. Removing a header is sometimes used for the purpose of correctly applying a patch.

#### 앱을 번역하는 방법은 무엇입니까?

앱을 다른 언어로 번역하거나 기존 번역을 개선하려면 [Transifex](https://www.transifex.com/unipatcher/unipatcher/dashboard/) 사이트에서 할 수 있습니다.

#### 질문, 기능 요청 혹은 버그 보고를 하고 싶습니다.

이메일 <unipatcher@gmail.com>로 저에게 연락하십시오. 영어 또는 러시아어로 작성해 주십시오. 패치에 문제가 있는 경우 메일에 패치를 첨부하고 롬 이름을 쓰면 시간이 단축됩니다.