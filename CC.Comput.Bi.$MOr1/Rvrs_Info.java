package CC.Encycloped.Abs.Org.Comput.Bi;

import CC.$.Q2$2.Bool2$2;
import CC.COd.Finishd;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q2$1.Bool2$1;
import CC.$.Q2$3.Bool2$3;

public class Rvrs_Info
{
	public static final Bool2$3
		Rvrs_Info_Or=(A,B,Out)->
		{
			Out[0]=A|B;
			Out[1]=A;
			Out[2]=B;
		},
		Rvrs_Info_Al=(A,B,Out)->
		{
			Out[0]=A&B;
			Out[1]=A;
			Out[2]=B;
		},
		/**Needs 3 outputs, due to fact that in case of 1,1 output must be 0,
		 * therefore, 2 non-result outputs to put them in.*/
		Xr=(A,B,Out)->
		{
			Out[0]=A^B;
			Out[1]=A;
			Out[2]=B;
		};

	@Finishd(Is_Finishd=true)
	public static final Rvrsbl_CalculAtr Rapr=new Rvrsbl_CalculAtr(3)
	{
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public void Rvrs(Bool2$1 Fun,
			boolean A,boolean B,
			boolean[] Out)
		{
			Out[0]=Fun.Bool2$1(A,B);
			Out[1]=A;
			Out[2]=B;
		}
	};

	public static final Bool2$2
		Rvrsbl_A=(A,B,Rsult)->
		{
			Rsult[0]=A;
			Rsult[1]=B;
		},
		Rvrsbl_B=(A,B,Rsult)->
		{
			Rsult[0]=B;
			Rsult[1]=A;
		};
}