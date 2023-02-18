
//지도 옵션 설정하기
var mapOptions = {
    center: new naver.maps.LatLng(37.3595704, 127.105399),
    zoom: 10
   }


//지도 생성하기: new 연산자를 이용하여 새 인스턴스 생성
//지도를 표현할 컨테이너 요소. 반드시 전달해야 하는 인수입니다. 앞서 지도를 표현하기 위해 지정한 DOM 요소의 id 문자열을 직접 전달하거나, 
//document.getElementById 메서드를 이용해 해당 DOM 요소의 참조를 전달할 수 있습니다.
 var map = new naver.maps.Map('map', {
    center: new naver.maps.LatLng(37.3595704, 127.105399),
    zoom: 10
});
