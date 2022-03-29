# BTS_ImageView_Android
BTS멤버 사진을 보여주는 간단한 안드로이드 어플

3월 29일 study: Element : ImageView, findViewById, Toast, Intent ...etc

        drawable에 사진을 넣고 ImageView scr로 가져오기
        
        xml ImageView에서 id 지정해준뒤 activity에서 findViewById<ImageView>(R.id.~~~)로 받아오기
         
        Toast는 Toast.makeText(this,"~~~",Toast.LENGTH_LONG).show()형식으로 잠깐 알림띄우는 기능 가능
        
        val intent = Intent(this, ~~~::class.java)로 넘어갈 activity정해 준뒤 startActivity(intent)로 넘어갈수있다.
        원시적이지만 여러개의 activity를 만들어서 화면전환이 가능하다.
