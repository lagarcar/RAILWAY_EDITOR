package eseo.idm.railway2jfx

import fr.eseo.atol.gen.ATOLGen
import fr.eseo.atol.gen.ATOLGen.Metamodel
import fr.eseo.atol.gen.plugin.constraints.common.Constraints

@ATOLGen(transformation="src/eseo/idm/railway2jfx/railway2jfx.atl", metamodels = #[
	@Metamodel(name = "Railway", impl = Railway),
	@Metamodel(name = "JFX", impl = JFX),
	@Metamodel(name = "Constraints", impl = Constraints)], extensions = #[Constraints])
	
class railway2jfx {
	
}