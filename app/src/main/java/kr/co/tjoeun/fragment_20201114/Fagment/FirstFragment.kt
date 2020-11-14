package kr.co.tjoeun.fragment_20201114.Fagment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first.*
import kr.co.tjoeun.fragment_20201114.R

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

//    프래그먼트 : 액티비티의 부속품으로 활용, 자체적으로 하나의 화면이 아님.
//    프래그먼트의 onCreate : 프래그먼트가 만들어질때 (부속품만 완성되었을때 : 화면은 아직)
//    안드로이드 대부분의 기능은 화면이 만들어지고 나서 사용해야 정상 동작.
//    프래그먼트의 onCreate는 잘 쓰이지 않는 이유.

//    프래그먼트의 동작관련 코드들 적는 함수 : onActivityCreated
//    나를 부품으로 들고 있는 화면이 완성된 시점.
//    동작 관련 코드 대부분을 화면 완성 이후에 실행되게 해준다.

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        toastBtn.setOnClickListener {
            Toast.makeText(context!!, "프래그먼트로 토스트 띄우기", Toast.LENGTH_SHORT).show()
        }

    }

}