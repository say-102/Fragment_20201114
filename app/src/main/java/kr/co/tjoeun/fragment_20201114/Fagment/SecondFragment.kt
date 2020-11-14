package kr.co.tjoeun.fragment_20201114.Fagment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_second.*
import kr.co.tjoeun.fragment_20201114.R

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        alertBtn.setOnClickListener {

            val alert = AlertDialog.Builder(context!!)
            alert.setTitle("프래그먼트 연습")
            alert.setMessage("프래그먼트에서 얼럿을 띄웁니다.")
            alert.setPositiveButton("확인", null)
            alert.show()
        }
    }

}