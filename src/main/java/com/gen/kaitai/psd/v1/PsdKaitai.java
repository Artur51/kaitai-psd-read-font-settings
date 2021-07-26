// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

package com.gen.kaitai.psd.v1;

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.ArrayList;

public class PsdKaitai extends KaitaiStruct {
    public static PsdKaitai fromFile(String fileName) throws IOException {
        return new PsdKaitai(new ByteBufferKaitaiStream(fileName));
    }

    public enum ColorMode {
        BITMAP(0),
        GRAYSCALE(1),
        INDEXED(2),
        RGB(3),
        CMYK(4),
        MULTICHANNEL(7),
        DUOTONE(8),
        LAB(9);

        private final long id;
        ColorMode(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ColorMode> byId = new HashMap<Long, ColorMode>(8);
        static {
            for (ColorMode e : ColorMode.values())
                byId.put(e.id(), e);
        }
        public static ColorMode byId(long id) { return byId.get(id); }
    }

    public enum ColorSpaces {
        RGB(0),
        HSB(1),
        CMYK(2),
        PANTONE_MATCHING_SYSTEM(3),
        FOCOLTONE_COLOUR_SYSTEM(4),
        TRUMATCH_COLOR(5),
        TOYO_88_COLORFINDER_1050(6),
        LAB(7),
        GRAYSCALE(8),
        WIDE_CMYK(9),
        HKS_COLORS(10),
        DIC(11),
        TOTAL_INK(12),
        MONITOR_RGB(13),
        DUOTONE(14),
        OPACITY(15),
        WEB(16),
        GRAY_FLOAT(17),
        RGB_FLOAT(18),
        OPACITY_FLOAT(19);

        private final long id;
        ColorSpaces(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ColorSpaces> byId = new HashMap<Long, ColorSpaces>(20);
        static {
            for (ColorSpaces e : ColorSpaces.values())
                byId.put(e.id(), e);
        }
        public static ColorSpaces byId(long id) { return byId.get(id); }
    }

    public enum BlendModes {
        COLOR(1668246642),
        DARKEN(1684107883),
        DIFFERENCE(1684629094),
        DISSOLVE(1684632435),
        COLOR_DODGE(1684633120),
        DARKER_COLOR(1684751212),
        DIVIDE(1717856630),
        SUBTRACT(1718842722),
        HARD_LIGHT(1749838196),
        HARD_MIX(1749903736),
        HUE(1752524064),
        COLOR_BURN(1768188278),
        LINEAR_LIGHT(1816947060),
        LINEAR_BURN(1818391150),
        LINEAR_DODGE(1818518631),
        LIGHTER_COLOR(1818706796),
        LIGHTEN(1818850405),
        LUMINOSITY(1819634976),
        MULTIPLY(1836411936),
        NORMAL(1852797549),
        OVERLAY(1870030194),
        PIN_LIGHT(1884055924),
        PASS_THROUGH(1885434739),
        SOFT_LIGHT(1934387572),
        SATURATION(1935766560),
        SCREEN(1935897198),
        EXCLUSION(1936553316),
        VIVID_LIGHT(1984719220);

        private final long id;
        BlendModes(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, BlendModes> byId = new HashMap<Long, BlendModes>(28);
        static {
            for (BlendModes e : BlendModes.values())
                byId.put(e.id(), e);
        }
        public static BlendModes byId(long id) { return byId.get(id); }
    }

    public PsdKaitai(KaitaiStream _io) {
        this(_io, null, null);
    }

    public PsdKaitai(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public PsdKaitai(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.header = new Header(this._io, this, _root);
        this.colorModeData = new ColorModeData(this._io, this, _root);
        this.imageResources = new ImageResources(this._io, this, _root);
        this.layerAndMaskInformation = new LayerAndMaskInformation(this._io, this, _root);
    }
    public static class PascalStringPaddedTo4ByteMultiple extends KaitaiStruct {
        public static PascalStringPaddedTo4ByteMultiple fromFile(String fileName) throws IOException {
            return new PascalStringPaddedTo4ByteMultiple(new ByteBufferKaitaiStream(fileName));
        }

        public PascalStringPaddedTo4ByteMultiple(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PascalStringPaddedTo4ByteMultiple(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData _parent) {
            this(_io, _parent, null);
        }

        public PascalStringPaddedTo4ByteMultiple(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData _parent, PsdKaitai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.length = this._io.readU1();
            this.string = new String(this._io.readBytes(length()), Charset.forName("ascii"));
            if (KaitaiStream.mod((length() + 1), 4) != 0) {
                this.padding = this._io.readBytes((4 - KaitaiStream.mod((length() + 1), 4)));
            }
        }
        private int length;
        private String string;
        private byte[] padding;
        private PsdKaitai _root;
        private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData _parent;
        public int length() { return length; }
        public String string() { return string; }
        public byte[] padding() { return padding; }
        public PsdKaitai _root() { return _root; }
        public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData _parent() { return _parent; }
    }
    public static class BlendModeStructure extends KaitaiStruct {
        public static BlendModeStructure fromFile(String fileName) throws IOException {
            return new BlendModeStructure(new ByteBufferKaitaiStream(fileName));
        }

        public BlendModeStructure(KaitaiStream _io) {
            this(_io, null, null);
        }

        public BlendModeStructure(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public BlendModeStructure(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.signature = this._io.readBytes(4);
            if (!(Arrays.equals(signature(), new byte[] { 56, 66, 73, 77 }))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[] { 56, 66, 73, 77 }, signature(), _io(), "/types/blend_mode_structure/seq/0");
            }
            this.key = PsdKaitai.BlendModes.byId(this._io.readU4be());
        }
        private byte[] signature;
        private BlendModes key;
        private PsdKaitai _root;
        private KaitaiStruct _parent;
        public byte[] signature() { return signature; }
        public BlendModes key() { return key; }
        public PsdKaitai _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class ColorModeData extends KaitaiStruct {
        public static ColorModeData fromFile(String fileName) throws IOException {
            return new ColorModeData(new ByteBufferKaitaiStream(fileName));
        }

        public ColorModeData(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ColorModeData(KaitaiStream _io, PsdKaitai _parent) {
            this(_io, _parent, null);
        }

        public ColorModeData(KaitaiStream _io, PsdKaitai _parent, PsdKaitai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sizeOfData = this._io.readS4be();
            if ( ((_parent().header().colorMode() == PsdKaitai.ColorMode.INDEXED) || (_parent().header().colorMode() == PsdKaitai.ColorMode.DUOTONE)) ) {
                this.data = this._io.readBytes(sizeOfData());
            }
        }
        private int sizeOfData;
        private byte[] data;
        private PsdKaitai _root;
        private PsdKaitai _parent;

        /**
         * for indexed color mode this size is 768, for duotone color mode this size is variable
         */
        public int sizeOfData() { return sizeOfData; }

        /**
         * this data is only provided if the color mode is either indexed or duotone
         */
        public byte[] data() { return data; }
        public PsdKaitai _root() { return _root; }
        public PsdKaitai _parent() { return _parent; }
    }
    public static class ImageResources extends KaitaiStruct {
        public static ImageResources fromFile(String fileName) throws IOException {
            return new ImageResources(new ByteBufferKaitaiStream(fileName));
        }

        public ImageResources(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ImageResources(KaitaiStream _io, PsdKaitai _parent) {
            this(_io, _parent, null);
        }

        public ImageResources(KaitaiStream _io, PsdKaitai _parent, PsdKaitai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sizeOfData = this._io.readS4be();
            this._raw_data = this._io.readBytes(sizeOfData());
            KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
            this.data = new ImageResourceBlocks(_io__raw_data, this, _root);
        }
        public static class ImageResourceBlocks extends KaitaiStruct {
            public static ImageResourceBlocks fromFile(String fileName) throws IOException {
                return new ImageResourceBlocks(new ByteBufferKaitaiStream(fileName));
            }

            public ImageResourceBlocks(KaitaiStream _io) {
                this(_io, null, null);
            }

            public ImageResourceBlocks(KaitaiStream _io, PsdKaitai.ImageResources _parent) {
                this(_io, _parent, null);
            }

            public ImageResourceBlocks(KaitaiStream _io, PsdKaitai.ImageResources _parent, PsdKaitai _root) {
                super(_io);
                this._parent = _parent;
                this._root = _root;
                _read();
            }
            private void _read() {
                this.resources = new ArrayList<ImageResourceBlock>();
                {
                    int i = 0;
                    while (!this._io.isEof()) {
                        this.resources.add(new ImageResourceBlock(this._io, this, _root));
                        i++;
                    }
                }
            }
            public static class ImageResourceBlock extends KaitaiStruct {
                public static ImageResourceBlock fromFile(String fileName) throws IOException {
                    return new ImageResourceBlock(new ByteBufferKaitaiStream(fileName));
                }

                public enum ImageResourceIdentifier {
                    PHOTOSHOP_2_0_VALUES(1000),
                    MACINTOSH_PRINT_MANAGER_PRINT_INFO_RECORD(1001),
                    MACINTOSH_PAGE_FORMAT_INFORMATION(1002),
                    INDEXED_COLOR_TABLE(1003),
                    RESOLUTION_INFO(1005),
                    ALPHA_CHANNEL_NAMES(1006),
                    OBSOLETE_1007(1007),
                    CAPTION(1008),
                    BORDER_INFORMATION(1009),
                    BACKGROUND_COLOR(1010),
                    PRINT_FLAGS(1011),
                    GRAYSCALE_MULTICHANNEL_HALFTONING_INFORMATION(1012),
                    COLOR_HALFTONING_INFORMATION(1013),
                    DUOTONE_HALFTONING_INFORMATION(1014),
                    GRAYSCALE_MULTICHANNEL_TRANSFER_FUNCTION(1015),
                    COLOR_TRANSFER_FUNCTIONS(1016),
                    DUOTONE_TRANSFER_FUNCTIONS(1017),
                    DUOTONE_IMAGE_INFORMATION(1018),
                    EFFECTIVE_BLACK_WHITE_VALUES_FOR_DOT_RANGE(1019),
                    OBSOLETE_1020(1020),
                    EPS_OPTIONS(1021),
                    QUICK_MASK_INFORMATION(1022),
                    OBSOLETE_1023(1023),
                    LAYER_STATE_INFORMATION(1024),
                    WORKING_PATH(1025),
                    LAYERS_GROUP_INFORMATION(1026),
                    OBSOLETE_1027(1027),
                    IPTC_NAA_RECORD(1028),
                    IMAGE_MODE_FOR_RAW_FORMAT_FILES(1029),
                    JPEG_QUALITY(1030),
                    GRID_GUIDES_INFORMATION(1032),
                    THUMBNAIL_RESOURCE_FOR_PHOTOSHOP_4(1033),
                    COPYRIGHT_FLAG(1034),
                    URL(1035),
                    THUMBNAIL_RESOURCE(1036),
                    GLOBAL_ANGLE(1037),
                    COLOR_SAMPLERS_RESOURCE_OBSOLETE1038(1038),
                    ICC_PROFILE(1039),
                    WATERMARK(1040),
                    ICC_UNTAGGED_PROFILE(1041),
                    EFFECTS_VISIBLE(1042),
                    SPOT_HALFTONE(1043),
                    DOCUMENT_SPECIFIC_IDS_SEED_NUMBER(1044),
                    UNICODE_ALPHA_NAMES(1045),
                    INDEXED_COLOR_TABLE_COUNT(1046),
                    TRANSPARENCY_INDEX(1047),
                    GLOBAL_ALTITUDE(1049),
                    SLICES(1050),
                    WORKFLOW_URL(1051),
                    JUMP_TO_XPEP(1052),
                    ALPHA_IDENTIFIERS(1053),
                    URL_LIST(1054),
                    VERSION_INFO(1057),
                    EXIF_DATA_1(1058),
                    EXIF_DATA_3(1059),
                    XMP_METADATA(1060),
                    CAPTION_DIGEST(1061),
                    PRINT_SCALE(1062),
                    PIXEL_ASPECT_RATIO(1064),
                    LAYER_COMPS(1065),
                    ALTERNATE_DUOTONE_COLORS(1066),
                    ALTERNATE_SPOT_COLORS(1067),
                    LAYER_SELECTION_IDS(1069),
                    HDR_TONING_INFORMATION(1070),
                    PRINT_INFO(1071),
                    LAYER_GROUPS_ENABLED_ID(1072),
                    COLOR_SAMPLERS_RESOURCE(1073),
                    MEASUREMENT_SCALE(1074),
                    TIMELINE_INFORMATION(1075),
                    SHEET_DISCLOSURE(1076),
                    DISPLAYINFO_STRUCTURE_FOR_FLOATING_POINT_COLORS(1077),
                    ONION_SKINS(1078),
                    COUNT_INFORMATION(1080),
                    PRINT_INFORMATION(1082),
                    PRINT_STYLE(1083),
                    MACINTOSH_NSPRINTINFO(1084),
                    WINDOWS_DEVMODE(1085),
                    AUTO_SAVE_FILE_PATH(1086),
                    AUTO_SAVE_FORMAT(1087),
                    PATH_SELECTION_STATE(1088),
                    PATH_INFORMATION_SAVED_PATH_FIRST(2000),
                    PATH_INFORMATION_SAVED_PATH_LAST(2998),
                    NAME_OF_CLIPPING_PATH(2999),
                    ORIGIN_PATH_INFO(3000),
                    PLUG_IN_RESOURCES_FIRST(4000),
                    PLUG_IN_RESOURCES_LAST(4999),
                    IMAGE_READY_VARIABLES(7000),
                    IMAGE_READY_DATA_SETS(7001),
                    IMAGE_READY_DEFAULT_SELECTED_STATE(7002),
                    IMAGE_READY_7_ROLLOVER_EXPANDED_STATE(7003),
                    IMAGE_READY_ROLLOVER_EXPANDED_STATE(7004),
                    IMAGE_READY_SAVE_LAYER_SETTINGS(7005),
                    IMAGE_READY_VERSION(7006),
                    LIGHTROOM_WORKFLOW(8000),
                    PRINT_FLAGS_INFORMATION(10000);

                    private final long id;
                    ImageResourceIdentifier(long id) { this.id = id; }
                    public long id() { return id; }
                    private static final Map<Long, ImageResourceIdentifier> byId = new HashMap<Long, ImageResourceIdentifier>(95);
                    static {
                        for (ImageResourceIdentifier e : ImageResourceIdentifier.values())
                            byId.put(e.id(), e);
                    }
                    public static ImageResourceIdentifier byId(long id) { return byId.get(id); }
                }

                public ImageResourceBlock(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public ImageResourceBlock(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks _parent) {
                    this(_io, _parent, null);
                }

                public ImageResourceBlock(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.signature = this._io.readBytes(4);
                    if (!(Arrays.equals(signature(), new byte[] { 56, 66, 73, 77 }))) {
                        throw new KaitaiStream.ValidationNotEqualError(new byte[] { 56, 66, 73, 77 }, signature(), _io(), "/types/image_resources/types/image_resource_blocks/types/image_resource_block/seq/0");
                    }
                    this.uniqueIdentifier = ImageResourceIdentifier.byId(this._io.readS2be());
                    this.name = new PascalStringPaddedTo2ByteMultiple(this._io, this, _root);
                    this.resourceDataSize = this._io.readS4be();
                    if (resourceIsNormal() == true) {
                        {
                            ImageResourceIdentifier on = uniqueIdentifier();
                            if (on != null) {
                                switch (uniqueIdentifier()) {
                                case PRINT_SCALE: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new PrintScaleResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case GRID_GUIDES_INFORMATION: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new GridGuidesInformationResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case LAYERS_GROUP_INFORMATION: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new LayersGroupInformationResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case URL_LIST: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new UrlListResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case JUMP_TO_XPEP: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new JumpToXpepResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case BORDER_INFORMATION: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new BorderInformationResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case GLOBAL_ANGLE: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new GlobalAngleResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case WATERMARK: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new WatermarkResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case ONION_SKINS: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new DescriptorResourceWithVersion(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case PRINT_FLAGS: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new PrintFlagsResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case PRINT_FLAGS_INFORMATION: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new PrintFlagsInformationResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case SPOT_HALFTONE: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new SpotHalftoneResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case AUTO_SAVE_FORMAT: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new UnicodeStringResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case LAYER_COMPS: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new DescriptorResourceWithVersion(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case ALTERNATE_DUOTONE_COLORS: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new AlternateDuotoneColorsResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case COUNT_INFORMATION: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new DescriptorResourceWithVersion(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case TIMELINE_INFORMATION: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new DescriptorResourceWithVersion(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case BACKGROUND_COLOR: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new ColorResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case MEASUREMENT_SCALE: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new DescriptorResourceWithVersion(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case UNICODE_ALPHA_NAMES: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new UnicodeStringResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case COLOR_SAMPLERS_RESOURCE: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new ColorSamplersResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case SLICES: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new SlicesResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case VERSION_INFO: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new VersionInfoResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case ALPHA_IDENTIFIERS: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new AlphaIdentifiersResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case EFFECTS_VISIBLE: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new EffectsVisibleResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case ICC_UNTAGGED_PROFILE: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new IccUntaggedProfileResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case GLOBAL_ALTITUDE: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new GlobalAltitudeResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case WORKFLOW_URL: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new UnicodeStringResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case QUICK_MASK_INFORMATION: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new QuickMaskInformationResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case TRANSPARENCY_INDEX: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new TransparencyIndexResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case LAYER_STATE_INFORMATION: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new LayerStateInformationResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case INDEXED_COLOR_TABLE_COUNT: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new IndexedColorTableCountResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case LAYER_SELECTION_IDS: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new LayerSelectionIdsResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case SHEET_DISCLOSURE: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new DescriptorResourceWithVersion(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case WORKING_PATH: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new PathResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case PIXEL_ASPECT_RATIO: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new PixelAspectRatioResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case THUMBNAIL_RESOURCE_FOR_PHOTOSHOP_4: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new ThumbnailResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case PRINT_STYLE: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new DescriptorResourceWithVersion(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case DOCUMENT_SPECIFIC_IDS_SEED_NUMBER: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new DocumentSpecificIdsSeedNumberResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case RESOLUTION_INFO: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new ResolutionInfoResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case PATH_SELECTION_STATE: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new DescriptorResourceWithVersion(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case PHOTOSHOP_2_0_VALUES: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new Photoshop20ValuesResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case CAPTION_DIGEST: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new CaptionDigestResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case THUMBNAIL_RESOURCE: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new ThumbnailResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case ALTERNATE_SPOT_COLORS: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new AlternateSpotColorsResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case CAPTION: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new PascalStringPaddedTo2ByteMultiple(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case PRINT_INFORMATION: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new DescriptorResourceWithVersion(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case AUTO_SAVE_FILE_PATH: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new UnicodeStringResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case LAYER_GROUPS_ENABLED_ID: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new LayerGroupsEnabledIdResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                case ALPHA_CHANNEL_NAMES: {
                                    this._raw_resourceData = this._io.readBytes(resourceDataSize());
                                    KaitaiStream _io__raw_resourceData = new ByteBufferKaitaiStream(_raw_resourceData);
                                    this.resourceData = new AlphaChannelNamesResource(_io__raw_resourceData, this, _root);
                                    break;
                                }
                                default: {
                                    this.resourceData = this._io.readBytes(resourceDataSize());
                                    break;
                                }
                                }
                            } else {
                                this.resourceData = this._io.readBytes(resourceDataSize());
                            }
                        }
                    }
                    if (resourceIsSavedPath() == true) {
                        this._raw_resourceData3 = this._io.readBytes(resourceDataSize());
                        KaitaiStream _io__raw_resourceData3 = new ByteBufferKaitaiStream(_raw_resourceData3);
                        this.resourceData3 = new PathResource(_io__raw_resourceData3, this, _root);
                    }
                    if (resourceIsPlugIn() == true) {
                        this.resourceData2 = this._io.readBytes(resourceDataSize());
                    }
                    if (KaitaiStream.mod((name().length() + resourceDataSize()), 2) == 1) {
                        this.padding = this._io.readBytes(1);
                    }
                }
                public static class ColorResource extends KaitaiStruct {
                    public static ColorResource fromFile(String fileName) throws IOException {
                        return new ColorResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public enum ColorSpaces {
                        RGB(0),
                        HSB(1),
                        CMYK(2),
                        PANTONE_MATCHING_SYSTEM(3),
                        FOCOLTONE_COLOUR_SYSTEM(4),
                        TRUMATCH_COLOR(5),
                        TOYO_88_COLORFINDER_1050(6),
                        LAB(7),
                        GRAYSCALE(8),
                        HKS_COLORS(10);

                        private final long id;
                        ColorSpaces(long id) { this.id = id; }
                        public long id() { return id; }
                        private static final Map<Long, ColorSpaces> byId = new HashMap<Long, ColorSpaces>(10);
                        static {
                            for (ColorSpaces e : ColorSpaces.values())
                                byId.put(e.id(), e);
                        }
                        public static ColorSpaces byId(long id) { return byId.get(id); }
                    }

                    public ColorResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public ColorResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public ColorResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.colorSpace = ColorSpaces.byId(this._io.readS2be());
                        colorValues = new ArrayList<Short>(((Number) (4)).intValue());
                        for (int i = 0; i < 4; i++) {
                            this.colorValues.add(this._io.readS2be());
                        }
                    }
                    private ColorSpaces colorSpace;
                    private ArrayList<Short> colorValues;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public ColorSpaces colorSpace() { return colorSpace; }
                    public ArrayList<Short> colorValues() { return colorValues; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class DocumentSpecificIdsSeedNumberResource extends KaitaiStruct {
                    public static DocumentSpecificIdsSeedNumberResource fromFile(String fileName) throws IOException {
                        return new DocumentSpecificIdsSeedNumberResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public DocumentSpecificIdsSeedNumberResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public DocumentSpecificIdsSeedNumberResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public DocumentSpecificIdsSeedNumberResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.seedNumber = this._io.readS4be();
                    }
                    private int seedNumber;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public int seedNumber() { return seedNumber; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class QuickMaskInformationResource extends KaitaiStruct {
                    public static QuickMaskInformationResource fromFile(String fileName) throws IOException {
                        return new QuickMaskInformationResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public QuickMaskInformationResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public QuickMaskInformationResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public QuickMaskInformationResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.quickMaskChannelId = this._io.readBytes(2);
                        this.maskInitiallyEmpty = this._io.readBitsIntBe(8);
                    }
                    private byte[] quickMaskChannelId;
                    private long maskInitiallyEmpty;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public byte[] quickMaskChannelId() { return quickMaskChannelId; }
                    public long maskInitiallyEmpty() { return maskInitiallyEmpty; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class ThumbnailResource extends KaitaiStruct {
                    public static ThumbnailResource fromFile(String fileName) throws IOException {
                        return new ThumbnailResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public enum ThumbnailFormats {
                        RAW_RGB(0),
                        JPEG_RGB(1);

                        private final long id;
                        ThumbnailFormats(long id) { this.id = id; }
                        public long id() { return id; }
                        private static final Map<Long, ThumbnailFormats> byId = new HashMap<Long, ThumbnailFormats>(2);
                        static {
                            for (ThumbnailFormats e : ThumbnailFormats.values())
                                byId.put(e.id(), e);
                        }
                        public static ThumbnailFormats byId(long id) { return byId.get(id); }
                    }

                    public ThumbnailResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public ThumbnailResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public ThumbnailResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.format = ThumbnailFormats.byId(this._io.readS4be());
                        this.width = this._io.readS4be();
                        this.height = this._io.readS4be();
                        this.widthBytes = this._io.readS4be();
                        this.totalSize = this._io.readS4be();
                        this.sizeAfterCompression = this._io.readS4be();
                        this.bitsPerPixel = this._io.readS2be();
                        this.numberOfPlanes = this._io.readS2be();
                        this.jfifCompressedData = this._io.readBytes(sizeAfterCompression());
                    }
                    private ThumbnailFormats format;
                    private int width;
                    private int height;
                    private int widthBytes;
                    private int totalSize;
                    private int sizeAfterCompression;
                    private short bitsPerPixel;
                    private short numberOfPlanes;
                    private byte[] jfifCompressedData;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public ThumbnailFormats format() { return format; }

                    /**
                     * value measured in number of pixels
                     */
                    public int width() { return width; }

                    /**
                     * value measured in number of pixels
                     */
                    public int height() { return height; }

                    /**
                     * value should be equal to (width * bits_per_pixel + 31) / 32 * 4
                     */
                    public int widthBytes() { return widthBytes; }

                    /**
                     * value should be equal to width_bytes * height * number_of_planes
                     */
                    public int totalSize() { return totalSize; }
                    public int sizeAfterCompression() { return sizeAfterCompression; }

                    /**
                     * should be equal to 24
                     */
                    public short bitsPerPixel() { return bitsPerPixel; }

                    /**
                     * should be equal to 1
                     */
                    public short numberOfPlanes() { return numberOfPlanes; }
                    public byte[] jfifCompressedData() { return jfifCompressedData; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class UrlListResource extends KaitaiStruct {
                    public static UrlListResource fromFile(String fileName) throws IOException {
                        return new UrlListResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public UrlListResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public UrlListResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public UrlListResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.numberOfUrls = this._io.readS4be();
                        urlData = new ArrayList<UrlDataType>(((Number) (numberOfUrls())).intValue());
                        for (int i = 0; i < numberOfUrls(); i++) {
                            this.urlData.add(new UrlDataType(this._io, this, _root));
                        }
                    }
                    public static class UrlDataType extends KaitaiStruct {
                        public static UrlDataType fromFile(String fileName) throws IOException {
                            return new UrlDataType(new ByteBufferKaitaiStream(fileName));
                        }

                        public UrlDataType(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public UrlDataType(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.UrlListResource _parent) {
                            this(_io, _parent, null);
                        }

                        public UrlDataType(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.UrlListResource _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.longValue = this._io.readBytes(4);
                            this.id = this._io.readBytes(4);
                            this.string = new UnicodeStringResource(this._io, this, _root);
                        }
                        private byte[] longValue;
                        private byte[] id;
                        private UnicodeStringResource string;
                        private PsdKaitai _root;
                        private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.UrlListResource _parent;
                        public byte[] longValue() { return longValue; }
                        public byte[] id() { return id; }
                        public UnicodeStringResource string() { return string; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.UrlListResource _parent() { return _parent; }
                    }
                    private int numberOfUrls;
                    private ArrayList<UrlDataType> urlData;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public int numberOfUrls() { return numberOfUrls; }
                    public ArrayList<UrlDataType> urlData() { return urlData; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class ColorSamplersResource extends KaitaiStruct {
                    public static ColorSamplersResource fromFile(String fileName) throws IOException {
                        return new ColorSamplersResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public ColorSamplersResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public ColorSamplersResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public ColorSamplersResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.header = new ColorSamplersHeader(this._io, this, _root);
                        colorSamplersBlocks = new ArrayList<ColorSamplersBlock>(((Number) (header().numberOfColorSamplers())).intValue());
                        for (int i = 0; i < header().numberOfColorSamplers(); i++) {
                            this.colorSamplersBlocks.add(new ColorSamplersBlock(this._io, this, _root));
                        }
                    }
                    public static class ColorSamplersHeader extends KaitaiStruct {
                        public static ColorSamplersHeader fromFile(String fileName) throws IOException {
                            return new ColorSamplersHeader(new ByteBufferKaitaiStream(fileName));
                        }

                        public ColorSamplersHeader(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public ColorSamplersHeader(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.ColorSamplersResource _parent) {
                            this(_io, _parent, null);
                        }

                        public ColorSamplersHeader(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.ColorSamplersResource _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.version = this._io.readS4be();
                            this.numberOfColorSamplers = this._io.readS4be();
                        }
                        private int version;
                        private int numberOfColorSamplers;
                        private PsdKaitai _root;
                        private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.ColorSamplersResource _parent;

                        /**
                         * value should be 1, 2 or 3
                         */
                        public int version() { return version; }
                        public int numberOfColorSamplers() { return numberOfColorSamplers; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.ColorSamplersResource _parent() { return _parent; }
                    }
                    public static class ColorSamplersBlock extends KaitaiStruct {
                        public static ColorSamplersBlock fromFile(String fileName) throws IOException {
                            return new ColorSamplersBlock(new ByteBufferKaitaiStream(fileName));
                        }

                        public ColorSamplersBlock(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public ColorSamplersBlock(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.ColorSamplersResource _parent) {
                            this(_io, _parent, null);
                        }

                        public ColorSamplersBlock(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.ColorSamplersResource _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            if (_parent().header().version() == 3) {
                                this.versionOfColorSamplers = this._io.readS4be();
                            }
                            this.horizontalPositionOfThePoint = this._io.readBytes(4);
                            this.verticalPositionOfThePoint = this._io.readBytes(4);
                            this.colorSpace = PsdKaitai.ColorSpaces.byId(this._io.readS2be());
                            if (_parent().header().version() == 2) {
                                this.depth = this._io.readS2be();
                            }
                        }
                        private Integer versionOfColorSamplers;
                        private byte[] horizontalPositionOfThePoint;
                        private byte[] verticalPositionOfThePoint;
                        private ColorSpaces colorSpace;
                        private Short depth;
                        private PsdKaitai _root;
                        private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.ColorSamplersResource _parent;

                        /**
                         * value should be 1
                         */
                        public Integer versionOfColorSamplers() { return versionOfColorSamplers; }

                        /**
                         * type is a fixed value for version 1, float value for version 2
                         */
                        public byte[] horizontalPositionOfThePoint() { return horizontalPositionOfThePoint; }
                        public byte[] verticalPositionOfThePoint() { return verticalPositionOfThePoint; }
                        public ColorSpaces colorSpace() { return colorSpace; }
                        public Short depth() { return depth; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.ColorSamplersResource _parent() { return _parent; }
                    }
                    private ColorSamplersHeader header;
                    private ArrayList<ColorSamplersBlock> colorSamplersBlocks;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public ColorSamplersHeader header() { return header; }
                    public ArrayList<ColorSamplersBlock> colorSamplersBlocks() { return colorSamplersBlocks; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class AlternateDuotoneColorsResource extends KaitaiStruct {
                    public static AlternateDuotoneColorsResource fromFile(String fileName) throws IOException {
                        return new AlternateDuotoneColorsResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public AlternateDuotoneColorsResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public AlternateDuotoneColorsResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public AlternateDuotoneColorsResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.version = this._io.readS2be();
                        this.count1 = this._io.readS2be();
                        colors = new ArrayList<ColorStructure>(((Number) (count1())).intValue());
                        for (int i = 0; i < count1(); i++) {
                            this.colors.add(new ColorStructure(this._io, this, _root));
                        }
                        this.count2 = this._io.readS2be();
                        labColors = new ArrayList<LabColorsType>(((Number) (count2())).intValue());
                        for (int i = 0; i < count2(); i++) {
                            this.labColors.add(new LabColorsType(this._io, this, _root));
                        }
                    }
                    public static class LabColorsType extends KaitaiStruct {
                        public static LabColorsType fromFile(String fileName) throws IOException {
                            return new LabColorsType(new ByteBufferKaitaiStream(fileName));
                        }

                        public LabColorsType(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public LabColorsType(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.AlternateDuotoneColorsResource _parent) {
                            this(_io, _parent, null);
                        }

                        public LabColorsType(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.AlternateDuotoneColorsResource _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.l = this._io.readBytes(1);
                            this.a = this._io.readBytes(1);
                            this.b = this._io.readBytes(1);
                        }
                        private byte[] l;
                        private byte[] a;
                        private byte[] b;
                        private PsdKaitai _root;
                        private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.AlternateDuotoneColorsResource _parent;
                        public byte[] l() { return l; }
                        public byte[] a() { return a; }
                        public byte[] b() { return b; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.AlternateDuotoneColorsResource _parent() { return _parent; }
                    }
                    private short version;
                    private short count1;
                    private ArrayList<ColorStructure> colors;
                    private short count2;
                    private ArrayList<LabColorsType> labColors;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;

                    /**
                     * value should be 1
                     */
                    public short version() { return version; }
                    public short count1() { return count1; }
                    public ArrayList<ColorStructure> colors() { return colors; }
                    public short count2() { return count2; }
                    public ArrayList<LabColorsType> labColors() { return labColors; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class SpotHalftoneResource extends KaitaiStruct {
                    public static SpotHalftoneResource fromFile(String fileName) throws IOException {
                        return new SpotHalftoneResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public SpotHalftoneResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public SpotHalftoneResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public SpotHalftoneResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.version = this._io.readS4be();
                        this.length = this._io.readS4be();
                        this.data = this._io.readBytes(length());
                    }
                    private int version;
                    private int length;
                    private byte[] data;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public int version() { return version; }
                    public int length() { return length; }
                    public byte[] data() { return data; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class LayerSelectionIdsResource extends KaitaiStruct {
                    public static LayerSelectionIdsResource fromFile(String fileName) throws IOException {
                        return new LayerSelectionIdsResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public LayerSelectionIdsResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public LayerSelectionIdsResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public LayerSelectionIdsResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.count = this._io.readS2be();
                        layerIds = new ArrayList<byte[]>(((Number) (count())).intValue());
                        for (int i = 0; i < count(); i++) {
                            this.layerIds.add(this._io.readBytes(4));
                        }
                    }
                    private short count;
                    private ArrayList<byte[]> layerIds;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public short count() { return count; }
                    public ArrayList<byte[]> layerIds() { return layerIds; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class VersionInfoResource extends KaitaiStruct {
                    public static VersionInfoResource fromFile(String fileName) throws IOException {
                        return new VersionInfoResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public VersionInfoResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public VersionInfoResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public VersionInfoResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.version = this._io.readS4be();
                        this.hasRealMergedData = this._io.readBytes(1);
                        this.writerName = new UnicodeStringResource(this._io, this, _root);
                        this.readerName = new UnicodeStringResource(this._io, this, _root);
                        this.fileVersion = this._io.readS4be();
                    }
                    private int version;
                    private byte[] hasRealMergedData;
                    private UnicodeStringResource writerName;
                    private UnicodeStringResource readerName;
                    private int fileVersion;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public int version() { return version; }
                    public byte[] hasRealMergedData() { return hasRealMergedData; }
                    public UnicodeStringResource writerName() { return writerName; }
                    public UnicodeStringResource readerName() { return readerName; }
                    public int fileVersion() { return fileVersion; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class AlphaChannelNamesResource extends KaitaiStruct {
                    public static AlphaChannelNamesResource fromFile(String fileName) throws IOException {
                        return new AlphaChannelNamesResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public AlphaChannelNamesResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public AlphaChannelNamesResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public AlphaChannelNamesResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.names = new ArrayList<PascalStringPaddedTo2ByteMultiple>();
                        {
                            int i = 0;
                            while (!this._io.isEof()) {
                                this.names.add(new PascalStringPaddedTo2ByteMultiple(this._io, this, _root));
                                i++;
                            }
                        }
                    }
                    private ArrayList<PascalStringPaddedTo2ByteMultiple> names;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public ArrayList<PascalStringPaddedTo2ByteMultiple> names() { return names; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class PrintFlagsInformationResource extends KaitaiStruct {
                    public static PrintFlagsInformationResource fromFile(String fileName) throws IOException {
                        return new PrintFlagsInformationResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public PrintFlagsInformationResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public PrintFlagsInformationResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public PrintFlagsInformationResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.version = this._io.readS2be();
                        this.centerCropMarks = this._io.readBytes(1);
                        this.padding = this._io.readBytes(1);
                        if (!(Arrays.equals(padding(), new byte[] { 0 }))) {
                            throw new KaitaiStream.ValidationNotEqualError(new byte[] { 0 }, padding(), _io(), "/types/image_resources/types/image_resource_blocks/types/image_resource_block/types/print_flags_information_resource/seq/2");
                        }
                        this.bleedWidthValue = this._io.readBytes(4);
                        this.bleedWidthScale = this._io.readBytes(2);
                    }
                    private short version;
                    private byte[] centerCropMarks;
                    private byte[] padding;
                    private byte[] bleedWidthValue;
                    private byte[] bleedWidthScale;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;

                    /**
                     * value should be 1
                     */
                    public short version() { return version; }
                    public byte[] centerCropMarks() { return centerCropMarks; }
                    public byte[] padding() { return padding; }
                    public byte[] bleedWidthValue() { return bleedWidthValue; }
                    public byte[] bleedWidthScale() { return bleedWidthScale; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class SlicesResource extends KaitaiStruct {
                    public static SlicesResource fromFile(String fileName) throws IOException {
                        return new SlicesResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public SlicesResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public SlicesResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public SlicesResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.header = new SlicesResourceHeader(this._io, this, _root);
                    }
                    public static class SlicesResourceHeader extends KaitaiStruct {
                        public static SlicesResourceHeader fromFile(String fileName) throws IOException {
                            return new SlicesResourceHeader(new ByteBufferKaitaiStream(fileName));
                        }

                        public SlicesResourceHeader(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public SlicesResourceHeader(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource _parent) {
                            this(_io, _parent, null);
                        }

                        public SlicesResourceHeader(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.version = this._io.readS4be();
                            switch (version()) {
                            case 6: {
                                this.header = new SlicesResourceHeaderV6(this._io, this, _root);
                                break;
                            }
                            case 7: {
                                this.header = new SlicesResourceHeaderV7(this._io, this, _root);
                                break;
                            }
                            case 8: {
                                this.header = new SlicesResourceHeaderV7(this._io, this, _root);
                                break;
                            }
                            }
                        }
                        public static class SlicesResourceHeaderV7 extends KaitaiStruct {
                            public static SlicesResourceHeaderV7 fromFile(String fileName) throws IOException {
                                return new SlicesResourceHeaderV7(new ByteBufferKaitaiStream(fileName));
                            }

                            public SlicesResourceHeaderV7(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public SlicesResourceHeaderV7(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource.SlicesResourceHeader _parent) {
                                this(_io, _parent, null);
                            }

                            public SlicesResourceHeaderV7(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource.SlicesResourceHeader _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.descriptorVersion = this._io.readS4be();
                                this.descriptor = new DescriptorResource(this._io, this, _root);
                            }
                            private int descriptorVersion;
                            private DescriptorResource descriptor;
                            private PsdKaitai _root;
                            private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource.SlicesResourceHeader _parent;
                            public int descriptorVersion() { return descriptorVersion; }
                            public DescriptorResource descriptor() { return descriptor; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource.SlicesResourceHeader _parent() { return _parent; }
                        }
                        public static class SlicesResourceHeaderV6 extends KaitaiStruct {
                            public static SlicesResourceHeaderV6 fromFile(String fileName) throws IOException {
                                return new SlicesResourceHeaderV6(new ByteBufferKaitaiStream(fileName));
                            }

                            public SlicesResourceHeaderV6(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public SlicesResourceHeaderV6(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource.SlicesResourceHeader _parent) {
                                this(_io, _parent, null);
                            }

                            public SlicesResourceHeaderV6(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource.SlicesResourceHeader _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.boundingRectangle = new BoundingRectangleType(this._io, this, _root);
                                this.nameOfSlicesGroup = new UnicodeStringResource(this._io, this, _root);
                                this.numberOfSlices = this._io.readS4be();
                                this.slicesResourceBlocks = new SlicesResourceBlock(this._io, this, _root);
                            }
                            public static class BoundingRectangleType extends KaitaiStruct {
                                public static BoundingRectangleType fromFile(String fileName) throws IOException {
                                    return new BoundingRectangleType(new ByteBufferKaitaiStream(fileName));
                                }

                                public BoundingRectangleType(KaitaiStream _io) {
                                    this(_io, null, null);
                                }

                                public BoundingRectangleType(KaitaiStream _io, KaitaiStruct _parent) {
                                    this(_io, _parent, null);
                                }

                                public BoundingRectangleType(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                                    super(_io);
                                    this._parent = _parent;
                                    this._root = _root;
                                    _read();
                                }
                                private void _read() {
                                    this.top = this._io.readS4be();
                                    this.left = this._io.readS4be();
                                    this.bottom = this._io.readS4be();
                                    this.right = this._io.readS4be();
                                }
                                private int top;
                                private int left;
                                private int bottom;
                                private int right;
                                private PsdKaitai _root;
                                private KaitaiStruct _parent;
                                public int top() { return top; }
                                public int left() { return left; }
                                public int bottom() { return bottom; }
                                public int right() { return right; }
                                public PsdKaitai _root() { return _root; }
                                public KaitaiStruct _parent() { return _parent; }
                            }
                            public static class SlicesResourceBlock extends KaitaiStruct {
                                public static SlicesResourceBlock fromFile(String fileName) throws IOException {
                                    return new SlicesResourceBlock(new ByteBufferKaitaiStream(fileName));
                                }

                                public enum CellTextFormats {
                                    PLAIN_TEXT(0),
                                    HTML(1);

                                    private final long id;
                                    CellTextFormats(long id) { this.id = id; }
                                    public long id() { return id; }
                                    private static final Map<Long, CellTextFormats> byId = new HashMap<Long, CellTextFormats>(2);
                                    static {
                                        for (CellTextFormats e : CellTextFormats.values())
                                            byId.put(e.id(), e);
                                    }
                                    public static CellTextFormats byId(long id) { return byId.get(id); }
                                }

                                public SlicesResourceBlock(KaitaiStream _io) {
                                    this(_io, null, null);
                                }

                                public SlicesResourceBlock(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource.SlicesResourceHeader.SlicesResourceHeaderV6 _parent) {
                                    this(_io, _parent, null);
                                }

                                public SlicesResourceBlock(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource.SlicesResourceHeader.SlicesResourceHeaderV6 _parent, PsdKaitai _root) {
                                    super(_io);
                                    this._parent = _parent;
                                    this._root = _root;
                                    _read();
                                }
                                private void _read() {
                                    this.id = this._io.readS4be();
                                    this.groupId = this._io.readS4be();
                                    this.origin = this._io.readS4be();
                                    if (origin() == 1) {
                                        this.associatedLayerId = this._io.readS4be();
                                    }
                                    this.name = new UnicodeStringResource(this._io, this, _root);
                                    this.type = this._io.readS4be();
                                    this.boundingBox = new BoundingRectangleType(this._io, this, _root);
                                    this.url = new UnicodeStringResource(this._io, this, _root);
                                    this.target = new UnicodeStringResource(this._io, this, _root);
                                    this.message = new UnicodeStringResource(this._io, this, _root);
                                    this.altTag = new UnicodeStringResource(this._io, this, _root);
                                    this.cellTextFormat = CellTextFormats.byId(this._io.readU1());
                                    this.cellText = new UnicodeStringResource(this._io, this, _root);
                                    this.horizontalAlignment = this._io.readS4be();
                                    this.verticalAlignment = this._io.readS4be();
                                    this.alphaColor = this._io.readBytes(1);
                                    this.red = this._io.readBytes(1);
                                    this.green = this._io.readBytes(1);
                                    this.blue = this._io.readBytes(1);
                                    this.descriptorVersion = this._io.readS4be();
                                    this.descriptor = new DescriptorResource(this._io, this, _root);
                                }
                                private int id;
                                private int groupId;
                                private int origin;
                                private Integer associatedLayerId;
                                private UnicodeStringResource name;
                                private int type;
                                private BoundingRectangleType boundingBox;
                                private UnicodeStringResource url;
                                private UnicodeStringResource target;
                                private UnicodeStringResource message;
                                private UnicodeStringResource altTag;
                                private CellTextFormats cellTextFormat;
                                private UnicodeStringResource cellText;
                                private int horizontalAlignment;
                                private int verticalAlignment;
                                private byte[] alphaColor;
                                private byte[] red;
                                private byte[] green;
                                private byte[] blue;
                                private int descriptorVersion;
                                private DescriptorResource descriptor;
                                private PsdKaitai _root;
                                private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource.SlicesResourceHeader.SlicesResourceHeaderV6 _parent;
                                public int id() { return id; }
                                public int groupId() { return groupId; }
                                public int origin() { return origin; }
                                public Integer associatedLayerId() { return associatedLayerId; }
                                public UnicodeStringResource name() { return name; }
                                public int type() { return type; }
                                public BoundingRectangleType boundingBox() { return boundingBox; }
                                public UnicodeStringResource url() { return url; }
                                public UnicodeStringResource target() { return target; }
                                public UnicodeStringResource message() { return message; }
                                public UnicodeStringResource altTag() { return altTag; }
                                public CellTextFormats cellTextFormat() { return cellTextFormat; }
                                public UnicodeStringResource cellText() { return cellText; }
                                public int horizontalAlignment() { return horizontalAlignment; }
                                public int verticalAlignment() { return verticalAlignment; }
                                public byte[] alphaColor() { return alphaColor; }
                                public byte[] red() { return red; }
                                public byte[] green() { return green; }
                                public byte[] blue() { return blue; }
                                public int descriptorVersion() { return descriptorVersion; }
                                public DescriptorResource descriptor() { return descriptor; }
                                public PsdKaitai _root() { return _root; }
                                public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource.SlicesResourceHeader.SlicesResourceHeaderV6 _parent() { return _parent; }
                            }
                            private BoundingRectangleType boundingRectangle;
                            private UnicodeStringResource nameOfSlicesGroup;
                            private int numberOfSlices;
                            private SlicesResourceBlock slicesResourceBlocks;
                            private PsdKaitai _root;
                            private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource.SlicesResourceHeader _parent;
                            public BoundingRectangleType boundingRectangle() { return boundingRectangle; }
                            public UnicodeStringResource nameOfSlicesGroup() { return nameOfSlicesGroup; }
                            public int numberOfSlices() { return numberOfSlices; }
                            public SlicesResourceBlock slicesResourceBlocks() { return slicesResourceBlocks; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource.SlicesResourceHeader _parent() { return _parent; }
                        }
                        private int version;
                        private KaitaiStruct header;
                        private PsdKaitai _root;
                        private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource _parent;
                        public int version() { return version; }
                        public KaitaiStruct header() { return header; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.SlicesResource _parent() { return _parent; }
                    }
                    private SlicesResourceHeader header;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public SlicesResourceHeader header() { return header; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class GlobalAltitudeResource extends KaitaiStruct {
                    public static GlobalAltitudeResource fromFile(String fileName) throws IOException {
                        return new GlobalAltitudeResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public GlobalAltitudeResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public GlobalAltitudeResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public GlobalAltitudeResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.globalAltitude = this._io.readS4be();
                    }
                    private int globalAltitude;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public int globalAltitude() { return globalAltitude; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class PrintFlagsResource extends KaitaiStruct {
                    public static PrintFlagsResource fromFile(String fileName) throws IOException {
                        return new PrintFlagsResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public PrintFlagsResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public PrintFlagsResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public PrintFlagsResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.labels = this._io.readBitsIntBe(8);
                        this.cropMarks = this._io.readBitsIntBe(8);
                        this.colorBars = this._io.readBitsIntBe(8);
                        this.registrationMarks = this._io.readBitsIntBe(8);
                        this.negative = this._io.readBitsIntBe(8);
                        this.flip = this._io.readBitsIntBe(8);
                        this.interpolate = this._io.readBitsIntBe(8);
                        this.caption = this._io.readBitsIntBe(8);
                        this.printFlags = this._io.readBitsIntBe(8);
                    }
                    private long labels;
                    private long cropMarks;
                    private long colorBars;
                    private long registrationMarks;
                    private long negative;
                    private long flip;
                    private long interpolate;
                    private long caption;
                    private long printFlags;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public long labels() { return labels; }
                    public long cropMarks() { return cropMarks; }
                    public long colorBars() { return colorBars; }
                    public long registrationMarks() { return registrationMarks; }
                    public long negative() { return negative; }
                    public long flip() { return flip; }
                    public long interpolate() { return interpolate; }
                    public long caption() { return caption; }
                    public long printFlags() { return printFlags; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class GlobalAngleResource extends KaitaiStruct {
                    public static GlobalAngleResource fromFile(String fileName) throws IOException {
                        return new GlobalAngleResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public GlobalAngleResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public GlobalAngleResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public GlobalAngleResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.globalLightingAngleForEffectsLayer = this._io.readS4be();
                    }
                    private int globalLightingAngleForEffectsLayer;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;

                    /**
                     * value should be between 0 and 359 degrees
                     */
                    public int globalLightingAngleForEffectsLayer() { return globalLightingAngleForEffectsLayer; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class IccUntaggedProfileResource extends KaitaiStruct {
                    public static IccUntaggedProfileResource fromFile(String fileName) throws IOException {
                        return new IccUntaggedProfileResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public enum ProfileHandlingApproaches {
                        ASSUMED_PROFILE_HANDLING(0),
                        INTENTIONALLY_UNTAGGED(1);

                        private final long id;
                        ProfileHandlingApproaches(long id) { this.id = id; }
                        public long id() { return id; }
                        private static final Map<Long, ProfileHandlingApproaches> byId = new HashMap<Long, ProfileHandlingApproaches>(2);
                        static {
                            for (ProfileHandlingApproaches e : ProfileHandlingApproaches.values())
                                byId.put(e.id(), e);
                        }
                        public static ProfileHandlingApproaches byId(long id) { return byId.get(id); }
                    }

                    public IccUntaggedProfileResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public IccUntaggedProfileResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public IccUntaggedProfileResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.profileHandling = ProfileHandlingApproaches.byId(this._io.readU1());
                    }
                    private ProfileHandlingApproaches profileHandling;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public ProfileHandlingApproaches profileHandling() { return profileHandling; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class WatermarkResource extends KaitaiStruct {
                    public static WatermarkResource fromFile(String fileName) throws IOException {
                        return new WatermarkResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public WatermarkResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public WatermarkResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public WatermarkResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.watermark = this._io.readBytes(1);
                    }
                    private byte[] watermark;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public byte[] watermark() { return watermark; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class BorderInformationResource extends KaitaiStruct {
                    public static BorderInformationResource fromFile(String fileName) throws IOException {
                        return new BorderInformationResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public enum BorderUnits {
                        INCHES(1),
                        CM(2),
                        POINTS(3),
                        PICAS(4),
                        COLUMNS(5);

                        private final long id;
                        BorderUnits(long id) { this.id = id; }
                        public long id() { return id; }
                        private static final Map<Long, BorderUnits> byId = new HashMap<Long, BorderUnits>(5);
                        static {
                            for (BorderUnits e : BorderUnits.values())
                                byId.put(e.id(), e);
                        }
                        public static BorderUnits byId(long id) { return byId.get(id); }
                    }

                    public BorderInformationResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public BorderInformationResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public BorderInformationResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.width = this._io.readF4be();
                        this.units = BorderUnits.byId(this._io.readS2be());
                    }
                    private float width;
                    private BorderUnits units;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public float width() { return width; }
                    public BorderUnits units() { return units; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class EffectsVisibleResource extends KaitaiStruct {
                    public static EffectsVisibleResource fromFile(String fileName) throws IOException {
                        return new EffectsVisibleResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public EffectsVisibleResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public EffectsVisibleResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public EffectsVisibleResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.effectsLayerVisibility = this._io.readU1();
                    }
                    private int effectsLayerVisibility;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;

                    /**
                     * global flag to show or hide all the effects layers
                     */
                    public int effectsLayerVisibility() { return effectsLayerVisibility; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class ResolutionInfoResource extends KaitaiStruct {
                    public static ResolutionInfoResource fromFile(String fileName) throws IOException {
                        return new ResolutionInfoResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public enum WidthHeightUnits {
                        INCHES(1),
                        CM(2),
                        POINTS(3),
                        PICAS(4),
                        COLUMNS(5);

                        private final long id;
                        WidthHeightUnits(long id) { this.id = id; }
                        public long id() { return id; }
                        private static final Map<Long, WidthHeightUnits> byId = new HashMap<Long, WidthHeightUnits>(5);
                        static {
                            for (WidthHeightUnits e : WidthHeightUnits.values())
                                byId.put(e.id(), e);
                        }
                        public static WidthHeightUnits byId(long id) { return byId.get(id); }
                    }

                    public ResolutionInfoResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public ResolutionInfoResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public ResolutionInfoResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.horizontalResolution = new ResolutionDefinition(this._io, this, _root);
                        this.widthUnit = WidthHeightUnits.byId(this._io.readS2be());
                        this.verticalResolution = new ResolutionDefinition(this._io, this, _root);
                        this.heightUnit = WidthHeightUnits.byId(this._io.readS2be());
                    }
                    public static class ResolutionDefinition extends KaitaiStruct {
                        public static ResolutionDefinition fromFile(String fileName) throws IOException {
                            return new ResolutionDefinition(new ByteBufferKaitaiStream(fileName));
                        }

                        public enum DisplayUnits {
                            PIXELS_PER_INCH(0),
                            PIXELS_PER_CM(1);

                            private final long id;
                            DisplayUnits(long id) { this.id = id; }
                            public long id() { return id; }
                            private static final Map<Long, DisplayUnits> byId = new HashMap<Long, DisplayUnits>(2);
                            static {
                                for (DisplayUnits e : DisplayUnits.values())
                                    byId.put(e.id(), e);
                            }
                            public static DisplayUnits byId(long id) { return byId.get(id); }
                        }

                        public ResolutionDefinition(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public ResolutionDefinition(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.ResolutionInfoResource _parent) {
                            this(_io, _parent, null);
                        }

                        public ResolutionDefinition(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.ResolutionInfoResource _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.resolution = this._io.readBytes(4);
                            this.displayUnit = DisplayUnits.byId(this._io.readS2be());
                        }
                        private byte[] resolution;
                        private DisplayUnits displayUnit;
                        private PsdKaitai _root;
                        private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.ResolutionInfoResource _parent;
                        public byte[] resolution() { return resolution; }
                        public DisplayUnits displayUnit() { return displayUnit; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.ResolutionInfoResource _parent() { return _parent; }
                    }
                    private ResolutionDefinition horizontalResolution;
                    private WidthHeightUnits widthUnit;
                    private ResolutionDefinition verticalResolution;
                    private WidthHeightUnits heightUnit;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public ResolutionDefinition horizontalResolution() { return horizontalResolution; }
                    public WidthHeightUnits widthUnit() { return widthUnit; }
                    public ResolutionDefinition verticalResolution() { return verticalResolution; }
                    public WidthHeightUnits heightUnit() { return heightUnit; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class IndexedColorTableCountResource extends KaitaiStruct {
                    public static IndexedColorTableCountResource fromFile(String fileName) throws IOException {
                        return new IndexedColorTableCountResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public IndexedColorTableCountResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public IndexedColorTableCountResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public IndexedColorTableCountResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.numberOfColorsInTableActuallyDefined = this._io.readS2be();
                    }
                    private short numberOfColorsInTableActuallyDefined;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public short numberOfColorsInTableActuallyDefined() { return numberOfColorsInTableActuallyDefined; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class GridGuidesInformationResource extends KaitaiStruct {
                    public static GridGuidesInformationResource fromFile(String fileName) throws IOException {
                        return new GridGuidesInformationResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public GridGuidesInformationResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public GridGuidesInformationResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public GridGuidesInformationResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.header = new GridGuideHeader(this._io, this, _root);
                        guideResourceBlocks = new ArrayList<GuideResourceBlock>(((Number) (header().numberOfGuideResourceBlocks())).intValue());
                        for (int i = 0; i < header().numberOfGuideResourceBlocks(); i++) {
                            this.guideResourceBlocks.add(new GuideResourceBlock(this._io, this, _root));
                        }
                    }
                    public static class GridGuideHeader extends KaitaiStruct {
                        public static GridGuideHeader fromFile(String fileName) throws IOException {
                            return new GridGuideHeader(new ByteBufferKaitaiStream(fileName));
                        }

                        public GridGuideHeader(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public GridGuideHeader(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.GridGuidesInformationResource _parent) {
                            this(_io, _parent, null);
                        }

                        public GridGuideHeader(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.GridGuidesInformationResource _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.version = this._io.readBytes(4);
                            if (!(Arrays.equals(version(), new byte[] { 0, 0, 0, 1 }))) {
                                throw new KaitaiStream.ValidationNotEqualError(new byte[] { 0, 0, 0, 1 }, version(), _io(), "/types/image_resources/types/image_resource_blocks/types/image_resource_block/types/grid_guides_information_resource/types/grid_guide_header/seq/0");
                            }
                            this.futureImplementationOfDocumentSpecificGrids = this._io.readBytes(8);
                            this.numberOfGuideResourceBlocks = this._io.readS4be();
                        }
                        private byte[] version;
                        private byte[] futureImplementationOfDocumentSpecificGrids;
                        private int numberOfGuideResourceBlocks;
                        private PsdKaitai _root;
                        private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.GridGuidesInformationResource _parent;
                        public byte[] version() { return version; }
                        public byte[] futureImplementationOfDocumentSpecificGrids() { return futureImplementationOfDocumentSpecificGrids; }
                        public int numberOfGuideResourceBlocks() { return numberOfGuideResourceBlocks; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.GridGuidesInformationResource _parent() { return _parent; }
                    }
                    public static class GuideResourceBlock extends KaitaiStruct {
                        public static GuideResourceBlock fromFile(String fileName) throws IOException {
                            return new GuideResourceBlock(new ByteBufferKaitaiStream(fileName));
                        }

                        public enum GuideDirections {
                            VERTICAL(0),
                            HORIZONTAL(1);

                            private final long id;
                            GuideDirections(long id) { this.id = id; }
                            public long id() { return id; }
                            private static final Map<Long, GuideDirections> byId = new HashMap<Long, GuideDirections>(2);
                            static {
                                for (GuideDirections e : GuideDirections.values())
                                    byId.put(e.id(), e);
                            }
                            public static GuideDirections byId(long id) { return byId.get(id); }
                        }

                        public GuideResourceBlock(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public GuideResourceBlock(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.GridGuidesInformationResource _parent) {
                            this(_io, _parent, null);
                        }

                        public GuideResourceBlock(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.GridGuidesInformationResource _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.locationOfGuideInDocumentCoordinates = this._io.readBytes(4);
                            this.directionOfGuide = GuideDirections.byId(this._io.readU1());
                        }
                        private byte[] locationOfGuideInDocumentCoordinates;
                        private GuideDirections directionOfGuide;
                        private PsdKaitai _root;
                        private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.GridGuidesInformationResource _parent;
                        public byte[] locationOfGuideInDocumentCoordinates() { return locationOfGuideInDocumentCoordinates; }
                        public GuideDirections directionOfGuide() { return directionOfGuide; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.GridGuidesInformationResource _parent() { return _parent; }
                    }
                    private GridGuideHeader header;
                    private ArrayList<GuideResourceBlock> guideResourceBlocks;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public GridGuideHeader header() { return header; }
                    public ArrayList<GuideResourceBlock> guideResourceBlocks() { return guideResourceBlocks; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class JumpToXpepResource extends KaitaiStruct {
                    public static JumpToXpepResource fromFile(String fileName) throws IOException {
                        return new JumpToXpepResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public JumpToXpepResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public JumpToXpepResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public JumpToXpepResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.majorVersion = this._io.readS2be();
                        this.minorVersion = this._io.readS2be();
                        this.count = this._io.readS4be();
                        blocks = new ArrayList<Block>(((Number) (count())).intValue());
                        for (int i = 0; i < count(); i++) {
                            this.blocks.add(new Block(this._io, this, _root));
                        }
                    }
                    public static class Block extends KaitaiStruct {
                        public static Block fromFile(String fileName) throws IOException {
                            return new Block(new ByteBufferKaitaiStream(fileName));
                        }

                        public enum Keys {
                            JTDD(1786004580);

                            private final long id;
                            Keys(long id) { this.id = id; }
                            public long id() { return id; }
                            private static final Map<Long, Keys> byId = new HashMap<Long, Keys>(1);
                            static {
                                for (Keys e : Keys.values())
                                    byId.put(e.id(), e);
                            }
                            public static Keys byId(long id) { return byId.get(id); }
                        }

                        public Block(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public Block(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.JumpToXpepResource _parent) {
                            this(_io, _parent, null);
                        }

                        public Block(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.JumpToXpepResource _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.size = this._io.readS4be();
                            this.key = Keys.byId(this._io.readU4be());
                            if (key() == Keys.JTDD) {
                                this.dirtyFlag = this._io.readU1();
                            }
                            if (key() != Keys.JTDD) {
                                this.modDate = this._io.readBytes(4);
                            }
                        }
                        private int size;
                        private Keys key;
                        private Integer dirtyFlag;
                        private byte[] modDate;
                        private PsdKaitai _root;
                        private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.JumpToXpepResource _parent;
                        public int size() { return size; }
                        public Keys key() { return key; }
                        public Integer dirtyFlag() { return dirtyFlag; }
                        public byte[] modDate() { return modDate; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.JumpToXpepResource _parent() { return _parent; }
                    }
                    private short majorVersion;
                    private short minorVersion;
                    private int count;
                    private ArrayList<Block> blocks;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public short majorVersion() { return majorVersion; }
                    public short minorVersion() { return minorVersion; }
                    public int count() { return count; }
                    public ArrayList<Block> blocks() { return blocks; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class AlphaIdentifiersResource extends KaitaiStruct {
                    public static AlphaIdentifiersResource fromFile(String fileName) throws IOException {
                        return new AlphaIdentifiersResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public AlphaIdentifiersResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public AlphaIdentifiersResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public AlphaIdentifiersResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.numberOfAlphaIdentifiers = this._io.readS4be();
                        alphaIdentifier = new ArrayList<byte[]>(((Number) (numberOfAlphaIdentifiers())).intValue());
                        for (int i = 0; i < numberOfAlphaIdentifiers(); i++) {
                            this.alphaIdentifier.add(this._io.readBytes(4));
                        }
                    }
                    private int numberOfAlphaIdentifiers;
                    private ArrayList<byte[]> alphaIdentifier;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public int numberOfAlphaIdentifiers() { return numberOfAlphaIdentifiers; }
                    public ArrayList<byte[]> alphaIdentifier() { return alphaIdentifier; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class PathResource extends KaitaiStruct {
                    public static PathResource fromFile(String fileName) throws IOException {
                        return new PathResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public PathResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public PathResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public PathResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this._raw_pathRecords = new ArrayList<byte[]>();
                        this.pathRecords = new ArrayList<PathRecord>();
                        {
                            int i = 0;
                            while (!this._io.isEof()) {
                                this._raw_pathRecords.add(this._io.readBytes(26));
                                KaitaiStream _io__raw_pathRecords = new ByteBufferKaitaiStream(_raw_pathRecords.get(_raw_pathRecords.size() - 1));
                                this.pathRecords.add(new PathRecord(_io__raw_pathRecords, this, _root));
                                i++;
                            }
                        }
                    }
                    public static class PathRecord extends KaitaiStruct {
                        public static PathRecord fromFile(String fileName) throws IOException {
                            return new PathRecord(new ByteBufferKaitaiStream(fileName));
                        }

                        public enum TypeOfPaths {
                            CLOSED_SUBPATH_LENGTH_RECORD(0),
                            CLOSED_SUBPATH_BEZIER_KNOT_LINKED(1),
                            CLOSED_SUBPATH_BEZIER_KNOT_UNLINKED(2),
                            OPEN_SUBPATH_LENGTH_RECORD(3),
                            OPEN_SUBPATH_BEZIER_KNOT_LINKED(4),
                            OPEN_SUBPATH_BEZIER_KNOT_UNLINKED(5),
                            PATH_FILL_RULE_RECORD(6),
                            CLIPBOARD_RECORD(7),
                            INITIAL_FILL_RULE_RECORD(8);

                            private final long id;
                            TypeOfPaths(long id) { this.id = id; }
                            public long id() { return id; }
                            private static final Map<Long, TypeOfPaths> byId = new HashMap<Long, TypeOfPaths>(9);
                            static {
                                for (TypeOfPaths e : TypeOfPaths.values())
                                    byId.put(e.id(), e);
                            }
                            public static TypeOfPaths byId(long id) { return byId.get(id); }
                        }

                        public PathRecord(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public PathRecord(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource _parent) {
                            this(_io, _parent, null);
                        }

                        public PathRecord(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.pathType = TypeOfPaths.byId(this._io.readS2be());
                            {
                                TypeOfPaths on = pathType();
                                if (on != null) {
                                    switch (pathType()) {
                                    case CLOSED_SUBPATH_BEZIER_KNOT_UNLINKED: {
                                        this.pathData = new BezierKnotRecordData(this._io, this, _root);
                                        break;
                                    }
                                    case OPEN_SUBPATH_BEZIER_KNOT_UNLINKED: {
                                        this.pathData = new BezierKnotRecordData(this._io, this, _root);
                                        break;
                                    }
                                    case OPEN_SUBPATH_LENGTH_RECORD: {
                                        this.pathData = new SubpathLengthRecordData(this._io, this, _root);
                                        break;
                                    }
                                    case INITIAL_FILL_RULE_RECORD: {
                                        this.pathData = new InitialFillRuleRecordData(this._io, this, _root);
                                        break;
                                    }
                                    case OPEN_SUBPATH_BEZIER_KNOT_LINKED: {
                                        this.pathData = new BezierKnotRecordData(this._io, this, _root);
                                        break;
                                    }
                                    case CLIPBOARD_RECORD: {
                                        this.pathData = new ClipboardRecordData(this._io, this, _root);
                                        break;
                                    }
                                    case CLOSED_SUBPATH_LENGTH_RECORD: {
                                        this.pathData = new SubpathLengthRecordData(this._io, this, _root);
                                        break;
                                    }
                                    case CLOSED_SUBPATH_BEZIER_KNOT_LINKED: {
                                        this.pathData = new BezierKnotRecordData(this._io, this, _root);
                                        break;
                                    }
                                    case PATH_FILL_RULE_RECORD: {
                                        this.pathData = new PathFillRuleRecordData(this._io, this, _root);
                                        break;
                                    }
                                    }
                                }
                            }
                        }
                        public static class SubpathLengthRecordData extends KaitaiStruct {
                            public static SubpathLengthRecordData fromFile(String fileName) throws IOException {
                                return new SubpathLengthRecordData(new ByteBufferKaitaiStream(fileName));
                            }

                            public SubpathLengthRecordData(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public SubpathLengthRecordData(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent) {
                                this(_io, _parent, null);
                            }

                            public SubpathLengthRecordData(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.numberOfBezierKnotRecords = this._io.readS2be();
                                this.padding = this._io.readBytes(22);
                            }
                            private short numberOfBezierKnotRecords;
                            private byte[] padding;
                            private PsdKaitai _root;
                            private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent;
                            public short numberOfBezierKnotRecords() { return numberOfBezierKnotRecords; }
                            public byte[] padding() { return padding; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent() { return _parent; }
                        }
                        public static class BezierKnotRecordData extends KaitaiStruct {
                            public static BezierKnotRecordData fromFile(String fileName) throws IOException {
                                return new BezierKnotRecordData(new ByteBufferKaitaiStream(fileName));
                            }

                            public BezierKnotRecordData(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public BezierKnotRecordData(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent) {
                                this(_io, _parent, null);
                            }

                            public BezierKnotRecordData(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.precedingPathControlPoint = new PathPoint(this._io, this, _root);
                                this.anchorPoint = new PathPoint(this._io, this, _root);
                                this.leavingPathControlPoint = new PathPoint(this._io, this, _root);
                            }
                            public static class PathPoint extends KaitaiStruct {
                                public static PathPoint fromFile(String fileName) throws IOException {
                                    return new PathPoint(new ByteBufferKaitaiStream(fileName));
                                }

                                public PathPoint(KaitaiStream _io) {
                                    this(_io, null, null);
                                }

                                public PathPoint(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord.BezierKnotRecordData _parent) {
                                    this(_io, _parent, null);
                                }

                                public PathPoint(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord.BezierKnotRecordData _parent, PsdKaitai _root) {
                                    super(_io);
                                    this._parent = _parent;
                                    this._root = _root;
                                    _read();
                                }
                                private void _read() {
                                    this.verticalComponent = this._io.readS4be();
                                    this.horizontalComponent = this._io.readS4be();
                                }
                                private int verticalComponent;
                                private int horizontalComponent;
                                private PsdKaitai _root;
                                private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord.BezierKnotRecordData _parent;
                                public int verticalComponent() { return verticalComponent; }
                                public int horizontalComponent() { return horizontalComponent; }
                                public PsdKaitai _root() { return _root; }
                                public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord.BezierKnotRecordData _parent() { return _parent; }
                            }
                            private PathPoint precedingPathControlPoint;
                            private PathPoint anchorPoint;
                            private PathPoint leavingPathControlPoint;
                            private PsdKaitai _root;
                            private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent;
                            public PathPoint precedingPathControlPoint() { return precedingPathControlPoint; }
                            public PathPoint anchorPoint() { return anchorPoint; }
                            public PathPoint leavingPathControlPoint() { return leavingPathControlPoint; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent() { return _parent; }
                        }
                        public static class InitialFillRuleRecordData extends KaitaiStruct {
                            public static InitialFillRuleRecordData fromFile(String fileName) throws IOException {
                                return new InitialFillRuleRecordData(new ByteBufferKaitaiStream(fileName));
                            }

                            public enum RecordValues {
                                FILL_DOES_NOT_START_WITH_ALL_PIXELS(0),
                                FILL_STARTS_WITH_ALL_PIXELS(1);

                                private final long id;
                                RecordValues(long id) { this.id = id; }
                                public long id() { return id; }
                                private static final Map<Long, RecordValues> byId = new HashMap<Long, RecordValues>(2);
                                static {
                                    for (RecordValues e : RecordValues.values())
                                        byId.put(e.id(), e);
                                }
                                public static RecordValues byId(long id) { return byId.get(id); }
                            }

                            public InitialFillRuleRecordData(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public InitialFillRuleRecordData(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent) {
                                this(_io, _parent, null);
                            }

                            public InitialFillRuleRecordData(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.record = RecordValues.byId(this._io.readS2be());
                                this.padding = this._io.readBytesFull();
                            }
                            private RecordValues record;
                            private byte[] padding;
                            private PsdKaitai _root;
                            private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent;
                            public RecordValues record() { return record; }
                            public byte[] padding() { return padding; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent() { return _parent; }
                        }
                        public static class PathFillRuleRecordData extends KaitaiStruct {
                            public static PathFillRuleRecordData fromFile(String fileName) throws IOException {
                                return new PathFillRuleRecordData(new ByteBufferKaitaiStream(fileName));
                            }

                            public PathFillRuleRecordData(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public PathFillRuleRecordData(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent) {
                                this(_io, _parent, null);
                            }

                            public PathFillRuleRecordData(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.padding = this._io.readBytes(24);
                            }
                            private byte[] padding;
                            private PsdKaitai _root;
                            private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent;

                            /**
                             * each byte must have a value of 0x00
                             */
                            public byte[] padding() { return padding; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent() { return _parent; }
                        }
                        public static class ClipboardRecordData extends KaitaiStruct {
                            public static ClipboardRecordData fromFile(String fileName) throws IOException {
                                return new ClipboardRecordData(new ByteBufferKaitaiStream(fileName));
                            }

                            public ClipboardRecordData(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public ClipboardRecordData(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent) {
                                this(_io, _parent, null);
                            }

                            public ClipboardRecordData(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.top = this._io.readS4be();
                                this.left = this._io.readS4be();
                                this.bottom = this._io.readS4be();
                                this.right = this._io.readS4be();
                                this.resolution = this._io.readS4be();
                                this.padding = this._io.readBytesFull();
                            }
                            private int top;
                            private int left;
                            private int bottom;
                            private int right;
                            private int resolution;
                            private byte[] padding;
                            private PsdKaitai _root;
                            private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent;
                            public int top() { return top; }
                            public int left() { return left; }
                            public int bottom() { return bottom; }
                            public int right() { return right; }
                            public int resolution() { return resolution; }
                            public byte[] padding() { return padding; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource.PathRecord _parent() { return _parent; }
                        }
                        private TypeOfPaths pathType;
                        private KaitaiStruct pathData;
                        private PsdKaitai _root;
                        private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource _parent;
                        public TypeOfPaths pathType() { return pathType; }
                        public KaitaiStruct pathData() { return pathData; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.PathResource _parent() { return _parent; }
                    }
                    private ArrayList<PathRecord> pathRecords;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    private ArrayList<byte[]> _raw_pathRecords;
                    public ArrayList<PathRecord> pathRecords() { return pathRecords; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                    public ArrayList<byte[]> _raw_pathRecords() { return _raw_pathRecords; }
                }
                public static class CaptionDigestResource extends KaitaiStruct {
                    public static CaptionDigestResource fromFile(String fileName) throws IOException {
                        return new CaptionDigestResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public CaptionDigestResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public CaptionDigestResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public CaptionDigestResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.md5Hash = this._io.readBytes(16);
                    }
                    private byte[] md5Hash;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public byte[] md5Hash() { return md5Hash; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class LayerGroupsEnabledIdResource extends KaitaiStruct {
                    public static LayerGroupsEnabledIdResource fromFile(String fileName) throws IOException {
                        return new LayerGroupsEnabledIdResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public LayerGroupsEnabledIdResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public LayerGroupsEnabledIdResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public LayerGroupsEnabledIdResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.layerGroupEnabled = new ArrayList<byte[]>();
                        {
                            int i = 0;
                            while (!this._io.isEof()) {
                                this.layerGroupEnabled.add(this._io.readBytes(1));
                                i++;
                            }
                        }
                    }
                    private ArrayList<byte[]> layerGroupEnabled;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public ArrayList<byte[]> layerGroupEnabled() { return layerGroupEnabled; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class LayerStateInformationResource extends KaitaiStruct {
                    public static LayerStateInformationResource fromFile(String fileName) throws IOException {
                        return new LayerStateInformationResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public LayerStateInformationResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public LayerStateInformationResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public LayerStateInformationResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.indexOfTargetLayer = this._io.readS2be();
                    }
                    private short indexOfTargetLayer;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;

                    /**
                     * a value of 0 equates to the bottom layer
                     */
                    public short indexOfTargetLayer() { return indexOfTargetLayer; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class Photoshop20ValuesResource extends KaitaiStruct {
                    public static Photoshop20ValuesResource fromFile(String fileName) throws IOException {
                        return new Photoshop20ValuesResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public Photoshop20ValuesResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public Photoshop20ValuesResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public Photoshop20ValuesResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.numberOfChannels = this._io.readS2be();
                        this.numberOfRows = this._io.readS2be();
                        this.depth = this._io.readS2be();
                        this.mode = this._io.readS2be();
                    }
                    private short numberOfChannels;
                    private short numberOfRows;
                    private short depth;
                    private short mode;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public short numberOfChannels() { return numberOfChannels; }
                    public short numberOfRows() { return numberOfRows; }
                    public short depth() { return depth; }
                    public short mode() { return mode; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class AlternateSpotColorsResource extends KaitaiStruct {
                    public static AlternateSpotColorsResource fromFile(String fileName) throws IOException {
                        return new AlternateSpotColorsResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public AlternateSpotColorsResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public AlternateSpotColorsResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public AlternateSpotColorsResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.version = this._io.readS2be();
                        this.numberOfChannels = this._io.readS2be();
                        alternateSpotColorsForChannels = new ArrayList<AlternateSpotColorsForChannel>(((Number) (numberOfChannels())).intValue());
                        for (int i = 0; i < numberOfChannels(); i++) {
                            this.alternateSpotColorsForChannels.add(new AlternateSpotColorsForChannel(this._io, this, _root));
                        }
                    }
                    public static class AlternateSpotColorsForChannel extends KaitaiStruct {
                        public static AlternateSpotColorsForChannel fromFile(String fileName) throws IOException {
                            return new AlternateSpotColorsForChannel(new ByteBufferKaitaiStream(fileName));
                        }

                        public AlternateSpotColorsForChannel(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public AlternateSpotColorsForChannel(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.AlternateSpotColorsResource _parent) {
                            this(_io, _parent, null);
                        }

                        public AlternateSpotColorsForChannel(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.AlternateSpotColorsResource _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.channelId = this._io.readBytes(4);
                            this.color = new ColorStructure(this._io, this, _root);
                        }
                        private byte[] channelId;
                        private ColorStructure color;
                        private PsdKaitai _root;
                        private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.AlternateSpotColorsResource _parent;
                        public byte[] channelId() { return channelId; }
                        public ColorStructure color() { return color; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock.AlternateSpotColorsResource _parent() { return _parent; }
                    }
                    private short version;
                    private short numberOfChannels;
                    private ArrayList<AlternateSpotColorsForChannel> alternateSpotColorsForChannels;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;

                    /**
                     * value should be 1
                     */
                    public short version() { return version; }
                    public short numberOfChannels() { return numberOfChannels; }
                    public ArrayList<AlternateSpotColorsForChannel> alternateSpotColorsForChannels() { return alternateSpotColorsForChannels; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class PixelAspectRatioResource extends KaitaiStruct {
                    public static PixelAspectRatioResource fromFile(String fileName) throws IOException {
                        return new PixelAspectRatioResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public PixelAspectRatioResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public PixelAspectRatioResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public PixelAspectRatioResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.version = this._io.readS4be();
                        this.aspectRatio = this._io.readF8be();
                    }
                    private int version;
                    private double aspectRatio;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;

                    /**
                     * value should be 1 or 2
                     */
                    public int version() { return version; }

                    /**
                     * x/y pixel aspect ratio
                     */
                    public double aspectRatio() { return aspectRatio; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class PrintScaleResource extends KaitaiStruct {
                    public static PrintScaleResource fromFile(String fileName) throws IOException {
                        return new PrintScaleResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public enum PrintScaleStyle {
                        CENTERED(0),
                        SIZE_TO_FIT(1),
                        USER_DEFINED(2);

                        private final long id;
                        PrintScaleStyle(long id) { this.id = id; }
                        public long id() { return id; }
                        private static final Map<Long, PrintScaleStyle> byId = new HashMap<Long, PrintScaleStyle>(3);
                        static {
                            for (PrintScaleStyle e : PrintScaleStyle.values())
                                byId.put(e.id(), e);
                        }
                        public static PrintScaleStyle byId(long id) { return byId.get(id); }
                    }

                    public PrintScaleResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public PrintScaleResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public PrintScaleResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.style = PrintScaleStyle.byId(this._io.readS2be());
                        this.xLocation = this._io.readBytes(4);
                        this.yLocation = this._io.readBytes(4);
                        this.scale = this._io.readBytes(4);
                    }
                    private PrintScaleStyle style;
                    private byte[] xLocation;
                    private byte[] yLocation;
                    private byte[] scale;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public PrintScaleStyle style() { return style; }
                    public byte[] xLocation() { return xLocation; }
                    public byte[] yLocation() { return yLocation; }
                    public byte[] scale() { return scale; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class TransparencyIndexResource extends KaitaiStruct {
                    public static TransparencyIndexResource fromFile(String fileName) throws IOException {
                        return new TransparencyIndexResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public TransparencyIndexResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public TransparencyIndexResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public TransparencyIndexResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.indexOfTransparentColor = this._io.readS2be();
                    }
                    private short indexOfTransparentColor;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public short indexOfTransparentColor() { return indexOfTransparentColor; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                public static class LayersGroupInformationResource extends KaitaiStruct {
                    public static LayersGroupInformationResource fromFile(String fileName) throws IOException {
                        return new LayersGroupInformationResource(new ByteBufferKaitaiStream(fileName));
                    }

                    public LayersGroupInformationResource(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public LayersGroupInformationResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent) {
                        this(_io, _parent, null);
                    }

                    public LayersGroupInformationResource(KaitaiStream _io, PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.layerGroups = new ArrayList<Short>();
                        {
                            int i = 0;
                            while (!this._io.isEof()) {
                                this.layerGroups.add(this._io.readS2be());
                                i++;
                            }
                        }
                    }
                    private ArrayList<Short> layerGroups;
                    private PsdKaitai _root;
                    private PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent;
                    public ArrayList<Short> layerGroups() { return layerGroups; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.ImageResources.ImageResourceBlocks.ImageResourceBlock _parent() { return _parent; }
                }
                private Boolean resourceIsSavedPath;
                public Boolean resourceIsSavedPath() {
                    if (this.resourceIsSavedPath != null)
                        return this.resourceIsSavedPath;
                    boolean _tmp = (boolean) ( ((uniqueIdentifier().id() >= ImageResourceIdentifier.PATH_INFORMATION_SAVED_PATH_FIRST.id()) && (uniqueIdentifier().id() <= ImageResourceIdentifier.PATH_INFORMATION_SAVED_PATH_LAST.id())) );
                    this.resourceIsSavedPath = _tmp;
                    return this.resourceIsSavedPath;
                }
                private Boolean resourceIsPlugIn;
                public Boolean resourceIsPlugIn() {
                    if (this.resourceIsPlugIn != null)
                        return this.resourceIsPlugIn;
                    boolean _tmp = (boolean) ( ((uniqueIdentifier().id() >= ImageResourceIdentifier.PLUG_IN_RESOURCES_FIRST.id()) && (uniqueIdentifier().id() <= ImageResourceIdentifier.PLUG_IN_RESOURCES_LAST.id())) );
                    this.resourceIsPlugIn = _tmp;
                    return this.resourceIsPlugIn;
                }
                private Boolean resourceIsNormal;
                public Boolean resourceIsNormal() {
                    if (this.resourceIsNormal != null)
                        return this.resourceIsNormal;
                    boolean _tmp = (boolean) (!( ((resourceIsSavedPath()) || (resourceIsPlugIn())) ));
                    this.resourceIsNormal = _tmp;
                    return this.resourceIsNormal;
                }
                private byte[] signature;
                private ImageResourceIdentifier uniqueIdentifier;
                private PascalStringPaddedTo2ByteMultiple name;
                private int resourceDataSize;
                private Object resourceData;
                private PathResource resourceData3;
                private byte[] resourceData2;
                private byte[] padding;
                private PsdKaitai _root;
                private PsdKaitai.ImageResources.ImageResourceBlocks _parent;
                private byte[] _raw_resourceData;
                private byte[] _raw_resourceData3;
                public byte[] signature() { return signature; }
                public ImageResourceIdentifier uniqueIdentifier() { return uniqueIdentifier; }
                public PascalStringPaddedTo2ByteMultiple name() { return name; }
                public int resourceDataSize() { return resourceDataSize; }
                public Object resourceData() { return resourceData; }
                public PathResource resourceData3() { return resourceData3; }
                public byte[] resourceData2() { return resourceData2; }
                public byte[] padding() { return padding; }
                public PsdKaitai _root() { return _root; }
                public PsdKaitai.ImageResources.ImageResourceBlocks _parent() { return _parent; }
                public byte[] _raw_resourceData() { return _raw_resourceData; }
                public byte[] _raw_resourceData3() { return _raw_resourceData3; }
            }
            private ArrayList<ImageResourceBlock> resources;
            private PsdKaitai _root;
            private PsdKaitai.ImageResources _parent;
            public ArrayList<ImageResourceBlock> resources() { return resources; }
            public PsdKaitai _root() { return _root; }
            public PsdKaitai.ImageResources _parent() { return _parent; }
        }
        private int sizeOfData;
        private ImageResourceBlocks data;
        private PsdKaitai _root;
        private PsdKaitai _parent;
        private byte[] _raw_data;
        public int sizeOfData() { return sizeOfData; }
        public ImageResourceBlocks data() { return data; }
        public PsdKaitai _root() { return _root; }
        public PsdKaitai _parent() { return _parent; }
        public byte[] _raw_data() { return _raw_data; }
    }
    public static class DescriptorResourceWithVersion extends KaitaiStruct {
        public static DescriptorResourceWithVersion fromFile(String fileName) throws IOException {
            return new DescriptorResourceWithVersion(new ByteBufferKaitaiStream(fileName));
        }

        public DescriptorResourceWithVersion(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DescriptorResourceWithVersion(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public DescriptorResourceWithVersion(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.descriptorVersion = this._io.readS4be();
            this.descriptor = new DescriptorResource(this._io, this, _root);
        }
        private int descriptorVersion;
        private DescriptorResource descriptor;
        private PsdKaitai _root;
        private KaitaiStruct _parent;
        public int descriptorVersion() { return descriptorVersion; }
        public DescriptorResource descriptor() { return descriptor; }
        public PsdKaitai _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class UnicodeStringResource extends KaitaiStruct {
        public static UnicodeStringResource fromFile(String fileName) throws IOException {
            return new UnicodeStringResource(new ByteBufferKaitaiStream(fileName));
        }

        public UnicodeStringResource(KaitaiStream _io) {
            this(_io, null, null);
        }

        public UnicodeStringResource(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public UnicodeStringResource(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.numberOfCharacters = this._io.readS4be();
            this.string = new String(this._io.readBytes((numberOfCharacters() * 2)), Charset.forName("UTF-16BE"));
        }
        private int numberOfCharacters;
        private String string;
        private PsdKaitai _root;
        private KaitaiStruct _parent;
        public int numberOfCharacters() { return numberOfCharacters; }
        public String string() { return string; }
        public PsdKaitai _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class ColorStructure extends KaitaiStruct {
        public static ColorStructure fromFile(String fileName) throws IOException {
            return new ColorStructure(new ByteBufferKaitaiStream(fileName));
        }

        public ColorStructure(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ColorStructure(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public ColorStructure(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.colorSpace = PsdKaitai.ColorSpaces.byId(this._io.readS2be());
            colorComponents = new ArrayList<Integer>(((Number) (4)).intValue());
            for (int i = 0; i < 4; i++) {
                this.colorComponents.add(this._io.readU2be());
            }
        }
        private ColorSpaces colorSpace;
        private ArrayList<Integer> colorComponents;
        private PsdKaitai _root;
        private KaitaiStruct _parent;
        public ColorSpaces colorSpace() { return colorSpace; }
        public ArrayList<Integer> colorComponents() { return colorComponents; }
        public PsdKaitai _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class BoundingBoxType extends KaitaiStruct {
        public static BoundingBoxType fromFile(String fileName) throws IOException {
            return new BoundingBoxType(new ByteBufferKaitaiStream(fileName));
        }

        public BoundingBoxType(KaitaiStream _io) {
            this(_io, null, null);
        }

        public BoundingBoxType(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public BoundingBoxType(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.top = this._io.readS4be();
            this.left = this._io.readS4be();
            this.bottom = this._io.readS4be();
            this.right = this._io.readS4be();
        }
        private int top;
        private int left;
        private int bottom;
        private int right;
        private PsdKaitai _root;
        private KaitaiStruct _parent;
        public int top() { return top; }
        public int left() { return left; }
        public int bottom() { return bottom; }
        public int right() { return right; }
        public PsdKaitai _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class LayerAndMaskInformation extends KaitaiStruct {
        public static LayerAndMaskInformation fromFile(String fileName) throws IOException {
            return new LayerAndMaskInformation(new ByteBufferKaitaiStream(fileName));
        }

        public LayerAndMaskInformation(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LayerAndMaskInformation(KaitaiStream _io, PsdKaitai _parent) {
            this(_io, _parent, null);
        }

        public LayerAndMaskInformation(KaitaiStream _io, PsdKaitai _parent, PsdKaitai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sizeOfData = this._io.readS4be();
            this._raw_data = this._io.readBytes(sizeOfData());
            KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
            this.data = new LayerAndMaskInformationData(_io__raw_data, this, _root);
        }
        public static class LayerAndMaskInformationData extends KaitaiStruct {
            public static LayerAndMaskInformationData fromFile(String fileName) throws IOException {
                return new LayerAndMaskInformationData(new ByteBufferKaitaiStream(fileName));
            }

            public LayerAndMaskInformationData(KaitaiStream _io) {
                this(_io, null, null);
            }

            public LayerAndMaskInformationData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation _parent) {
                this(_io, _parent, null);
            }

            public LayerAndMaskInformationData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation _parent, PsdKaitai _root) {
                super(_io);
                this._parent = _parent;
                this._root = _root;
                _read();
            }
            private void _read() {
                this.layerInformation = new LayerInformation(this._io, this, _root);
                this.globalLayerMaskInformation = new GlobalLayerMaskInformation(this._io, this, _root);
                this.additionalLayerInformation = new ArrayList<AdditionalLayerInformation>();
                {
                    int i = 0;
                    while (!this._io.isEof()) {
                        this.additionalLayerInformation.add(new AdditionalLayerInformation(this._io, this, _root));
                        i++;
                    }
                }
            }
            public static class LayerInformation extends KaitaiStruct {
                public static LayerInformation fromFile(String fileName) throws IOException {
                    return new LayerInformation(new ByteBufferKaitaiStream(fileName));
                }

                public LayerInformation(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public LayerInformation(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData _parent) {
                    this(_io, _parent, null);
                }

                public LayerInformation(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.sizeOfData = this._io.readS4be();
                    this._raw_data = this._io.readBytes(sizeOfData());
                    KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                    this.data = new LayerInformationData(_io__raw_data, this, _root);
                }
                public static class LayerInformationData extends KaitaiStruct {
                    public static LayerInformationData fromFile(String fileName) throws IOException {
                        return new LayerInformationData(new ByteBufferKaitaiStream(fileName));
                    }

                    public LayerInformationData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public LayerInformationData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation _parent) {
                        this(_io, _parent, null);
                    }

                    public LayerInformationData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.layerCount = this._io.readS2be();
                        layerRecords = new ArrayList<LayerRecord>(((Number) (layerCount())).intValue());
                        for (int i = 0; i < layerCount(); i++) {
                            this.layerRecords.add(new LayerRecord(this._io, this, _root));
                        }
                        this.channelImageDataRecords = this._io.readBytesFull();
                    }
                    public static class LayerRecord extends KaitaiStruct {
                        public static LayerRecord fromFile(String fileName) throws IOException {
                            return new LayerRecord(new ByteBufferKaitaiStream(fileName));
                        }

                        public enum ClippingModes {
                            BASE(0),
                            NON_BASE(1);

                            private final long id;
                            ClippingModes(long id) { this.id = id; }
                            public long id() { return id; }
                            private static final Map<Long, ClippingModes> byId = new HashMap<Long, ClippingModes>(2);
                            static {
                                for (ClippingModes e : ClippingModes.values())
                                    byId.put(e.id(), e);
                            }
                            public static ClippingModes byId(long id) { return byId.get(id); }
                        }

                        public LayerRecord(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public LayerRecord(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData _parent) {
                            this(_io, _parent, null);
                        }

                        public LayerRecord(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.boundingBox = new BoundingBoxType(this._io, this, _root);
                            this.numberOfChannels = this._io.readS2be();
                            channelInformation = new ArrayList<ChannelInformationRecord>(((Number) (numberOfChannels())).intValue());
                            for (int i = 0; i < numberOfChannels(); i++) {
                                this.channelInformation.add(new ChannelInformationRecord(this._io, this, _root));
                            }
                            this.blendMode = new BlendModeStructure(this._io, this, _root);
                            this.opacity = this._io.readU1();
                            this.clippingMode = ClippingModes.byId(this._io.readU1());
                            this.flags = new LayerRecordFlags(this._io, this, _root);
                            this.padding = this._io.readBytes(1);
                            if (!(Arrays.equals(padding(), new byte[] { 0 }))) {
                                throw new KaitaiStream.ValidationNotEqualError(new byte[] { 0 }, padding(), _io(), "/types/layer_and_mask_information/types/layer_and_mask_information_data/types/layer_information/types/layer_information_data/types/layer_record/seq/7");
                            }
                            this.sizeOfExtraDataFields = this._io.readS4be();
                            this._raw_extraData = this._io.readBytes(sizeOfExtraDataFields());
                            KaitaiStream _io__raw_extraData = new ByteBufferKaitaiStream(_raw_extraData);
                            this.extraData = new ExtraData(_io__raw_extraData, this, _root);
                        }
                        public static class ChannelInformationRecord extends KaitaiStruct {
                            public static ChannelInformationRecord fromFile(String fileName) throws IOException {
                                return new ChannelInformationRecord(new ByteBufferKaitaiStream(fileName));
                            }

                            public enum ChannelIds {
                                RED(0),
                                GREEN(1),
                                BLUE(2);

                                private final long id;
                                ChannelIds(long id) { this.id = id; }
                                public long id() { return id; }
                                private static final Map<Long, ChannelIds> byId = new HashMap<Long, ChannelIds>(3);
                                static {
                                    for (ChannelIds e : ChannelIds.values())
                                        byId.put(e.id(), e);
                                }
                                public static ChannelIds byId(long id) { return byId.get(id); }
                            }

                            public ChannelInformationRecord(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public ChannelInformationRecord(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord _parent) {
                                this(_io, _parent, null);
                            }

                            public ChannelInformationRecord(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.id = ChannelIds.byId(this._io.readS2be());
                                this.data = this._io.readBytes(4);
                            }
                            private ChannelIds id;
                            private byte[] data;
                            private PsdKaitai _root;
                            private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord _parent;
                            public ChannelIds id() { return id; }
                            public byte[] data() { return data; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord _parent() { return _parent; }
                        }
                        public static class LayerRecordFlags extends KaitaiStruct {
                            public static LayerRecordFlags fromFile(String fileName) throws IOException {
                                return new LayerRecordFlags(new ByteBufferKaitaiStream(fileName));
                            }

                            public LayerRecordFlags(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public LayerRecordFlags(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord _parent) {
                                this(_io, _parent, null);
                            }

                            public LayerRecordFlags(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.transparencyProtected = this._io.readBitsIntBe(1) != 0;
                                this.visible = this._io.readBitsIntBe(1) != 0;
                                this.obsolete = this._io.readBitsIntBe(1) != 0;
                                this.bit4HasUsefulInformation = this._io.readBitsIntBe(1) != 0;
                                this.pixelDataIrrelvantToAppearanceOfDocument = this._io.readBitsIntBe(1) != 0;
                                this.unusedFlags = this._io.readBitsIntBe(3);
                            }
                            private boolean transparencyProtected;
                            private boolean visible;
                            private boolean obsolete;
                            private boolean bit4HasUsefulInformation;
                            private boolean pixelDataIrrelvantToAppearanceOfDocument;
                            private long unusedFlags;
                            private PsdKaitai _root;
                            private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord _parent;
                            public boolean transparencyProtected() { return transparencyProtected; }
                            public boolean visible() { return visible; }
                            public boolean obsolete() { return obsolete; }
                            public boolean bit4HasUsefulInformation() { return bit4HasUsefulInformation; }
                            public boolean pixelDataIrrelvantToAppearanceOfDocument() { return pixelDataIrrelvantToAppearanceOfDocument; }
                            public long unusedFlags() { return unusedFlags; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord _parent() { return _parent; }
                        }
                        public static class ExtraData extends KaitaiStruct {
                            public static ExtraData fromFile(String fileName) throws IOException {
                                return new ExtraData(new ByteBufferKaitaiStream(fileName));
                            }

                            public ExtraData(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public ExtraData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord _parent) {
                                this(_io, _parent, null);
                            }

                            public ExtraData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.layerMaskData = new LayerMaskAdjustmentLayer(this._io, this, _root);
                                this.layerBlendingRanges = new LayerBlendingRanges(this._io, this, _root);
                                this.layerName = new PascalStringPaddedTo4ByteMultiple(this._io, this, _root);
                                this.additionalLayerInformation = new ArrayList<AdditionalLayerInformation>();
                                {
                                    int i = 0;
                                    while (!this._io.isEof()) {
                                        this.additionalLayerInformation.add(new AdditionalLayerInformation(this._io, this, _root));
                                        i++;
                                    }
                                }
                            }
                            public static class LayerMaskAdjustmentLayer extends KaitaiStruct {
                                public static LayerMaskAdjustmentLayer fromFile(String fileName) throws IOException {
                                    return new LayerMaskAdjustmentLayer(new ByteBufferKaitaiStream(fileName));
                                }

                                public LayerMaskAdjustmentLayer(KaitaiStream _io) {
                                    this(_io, null, null);
                                }

                                public LayerMaskAdjustmentLayer(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData _parent) {
                                    this(_io, _parent, null);
                                }

                                public LayerMaskAdjustmentLayer(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData _parent, PsdKaitai _root) {
                                    super(_io);
                                    this._parent = _parent;
                                    this._root = _root;
                                    _read();
                                }
                                private void _read() {
                                    this.sizeOfData = this._io.readS4be();
                                    if (sizeOfData() != 0) {
                                        this._raw_data = this._io.readBytes(sizeOfData());
                                        KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                        this.data = new LayerMaskAdjustmentLayerData(_io__raw_data, this, _root);
                                    }
                                }
                                public static class LayerMaskAdjustmentLayerData extends KaitaiStruct {
                                    public static LayerMaskAdjustmentLayerData fromFile(String fileName) throws IOException {
                                        return new LayerMaskAdjustmentLayerData(new ByteBufferKaitaiStream(fileName));
                                    }

                                    public LayerMaskAdjustmentLayerData(KaitaiStream _io) {
                                        this(_io, null, null);
                                    }

                                    public LayerMaskAdjustmentLayerData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerMaskAdjustmentLayer _parent) {
                                        this(_io, _parent, null);
                                    }

                                    public LayerMaskAdjustmentLayerData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerMaskAdjustmentLayer _parent, PsdKaitai _root) {
                                        super(_io);
                                        this._parent = _parent;
                                        this._root = _root;
                                        _read();
                                    }
                                    private void _read() {
                                        this.boundingBox = new BoundingBoxType(this._io, this, _root);
                                        this.defaultColor = this._io.readU1();
                                        this.flags = new FlagParameters(this._io, this, _root);
                                        if (flags().userAndOrVectorMasksHaveParametersApplied() == true) {
                                            this.maskParameters = new MaskParameters(this._io, this, _root);
                                        }
                                        if (_parent().sizeOfData() == 20) {
                                            this.padding = this._io.readBytes(2);
                                            if (!(Arrays.equals(padding(), new byte[] { 0, 0 }))) {
                                                throw new KaitaiStream.ValidationNotEqualError(new byte[] { 0, 0 }, padding(), _io(), "/types/layer_and_mask_information/types/layer_and_mask_information_data/types/layer_information/types/layer_information_data/types/layer_record/types/extra_data/types/layer_mask_adjustment_layer/types/layer_mask_adjustment_layer_data/seq/4");
                                            }
                                        }
                                        if (_parent().sizeOfData() != 20) {
                                            this.realFlags = new FlagParameters(this._io, this, _root);
                                        }
                                        if (_parent().sizeOfData() != 20) {
                                            this.realUserMaskBackground = this._io.readU1();
                                        }
                                        if (_parent().sizeOfData() != 20) {
                                            this.realBoundingBox = new BoundingBoxType(this._io, this, _root);
                                        }
                                    }
                                    public static class FlagParameters extends KaitaiStruct {
                                        public static FlagParameters fromFile(String fileName) throws IOException {
                                            return new FlagParameters(new ByteBufferKaitaiStream(fileName));
                                        }

                                        public FlagParameters(KaitaiStream _io) {
                                            this(_io, null, null);
                                        }

                                        public FlagParameters(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerMaskAdjustmentLayer.LayerMaskAdjustmentLayerData _parent) {
                                            this(_io, _parent, null);
                                        }

                                        public FlagParameters(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerMaskAdjustmentLayer.LayerMaskAdjustmentLayerData _parent, PsdKaitai _root) {
                                            super(_io);
                                            this._parent = _parent;
                                            this._root = _root;
                                            _read();
                                        }
                                        private void _read() {
                                            this.positionRelativeToLayer = this._io.readBitsIntBe(1) != 0;
                                            this.layerMaskDisabled = this._io.readBitsIntBe(1) != 0;
                                            this.invertLayerMaskWhenBlending = this._io.readBitsIntBe(1) != 0;
                                            this.userMaskCameFromRenderingOtherData = this._io.readBitsIntBe(1) != 0;
                                            this.userAndOrVectorMasksHaveParametersApplied = this._io.readBitsIntBe(1) != 0;
                                            this.unusedFlags = this._io.readBitsIntBe(3);
                                        }
                                        private boolean positionRelativeToLayer;
                                        private boolean layerMaskDisabled;
                                        private boolean invertLayerMaskWhenBlending;
                                        private boolean userMaskCameFromRenderingOtherData;
                                        private boolean userAndOrVectorMasksHaveParametersApplied;
                                        private long unusedFlags;
                                        private PsdKaitai _root;
                                        private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerMaskAdjustmentLayer.LayerMaskAdjustmentLayerData _parent;
                                        public boolean positionRelativeToLayer() { return positionRelativeToLayer; }
                                        public boolean layerMaskDisabled() { return layerMaskDisabled; }
                                        public boolean invertLayerMaskWhenBlending() { return invertLayerMaskWhenBlending; }
                                        public boolean userMaskCameFromRenderingOtherData() { return userMaskCameFromRenderingOtherData; }
                                        public boolean userAndOrVectorMasksHaveParametersApplied() { return userAndOrVectorMasksHaveParametersApplied; }
                                        public long unusedFlags() { return unusedFlags; }
                                        public PsdKaitai _root() { return _root; }
                                        public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerMaskAdjustmentLayer.LayerMaskAdjustmentLayerData _parent() { return _parent; }
                                    }
                                    public static class MaskParameters extends KaitaiStruct {
                                        public static MaskParameters fromFile(String fileName) throws IOException {
                                            return new MaskParameters(new ByteBufferKaitaiStream(fileName));
                                        }

                                        public MaskParameters(KaitaiStream _io) {
                                            this(_io, null, null);
                                        }

                                        public MaskParameters(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerMaskAdjustmentLayer.LayerMaskAdjustmentLayerData _parent) {
                                            this(_io, _parent, null);
                                        }

                                        public MaskParameters(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerMaskAdjustmentLayer.LayerMaskAdjustmentLayerData _parent, PsdKaitai _root) {
                                            super(_io);
                                            this._parent = _parent;
                                            this._root = _root;
                                            _read();
                                        }
                                        private void _read() {
                                            this.userMaskDensity1Byte = this._io.readBitsIntBe(1) != 0;
                                            this.userMaskFeather8ByteDouble = this._io.readBitsIntBe(1) != 0;
                                            this.vectorMaskDensity1Byte = this._io.readBitsIntBe(1) != 0;
                                            this.vectorMaskFeather8ByteDouble = this._io.readBitsIntBe(1) != 0;
                                            this.unusedFlags = this._io.readBitsIntBe(4);
                                        }
                                        private boolean userMaskDensity1Byte;
                                        private boolean userMaskFeather8ByteDouble;
                                        private boolean vectorMaskDensity1Byte;
                                        private boolean vectorMaskFeather8ByteDouble;
                                        private long unusedFlags;
                                        private PsdKaitai _root;
                                        private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerMaskAdjustmentLayer.LayerMaskAdjustmentLayerData _parent;
                                        public boolean userMaskDensity1Byte() { return userMaskDensity1Byte; }
                                        public boolean userMaskFeather8ByteDouble() { return userMaskFeather8ByteDouble; }
                                        public boolean vectorMaskDensity1Byte() { return vectorMaskDensity1Byte; }
                                        public boolean vectorMaskFeather8ByteDouble() { return vectorMaskFeather8ByteDouble; }
                                        public long unusedFlags() { return unusedFlags; }
                                        public PsdKaitai _root() { return _root; }
                                        public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerMaskAdjustmentLayer.LayerMaskAdjustmentLayerData _parent() { return _parent; }
                                    }
                                    private BoundingBoxType boundingBox;
                                    private int defaultColor;
                                    private FlagParameters flags;
                                    private MaskParameters maskParameters;
                                    private byte[] padding;
                                    private FlagParameters realFlags;
                                    private Integer realUserMaskBackground;
                                    private BoundingBoxType realBoundingBox;
                                    private PsdKaitai _root;
                                    private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerMaskAdjustmentLayer _parent;
                                    public BoundingBoxType boundingBox() { return boundingBox; }

                                    /**
                                     * value should be 0 or 255
                                     */
                                    public int defaultColor() { return defaultColor; }
                                    public FlagParameters flags() { return flags; }
                                    public MaskParameters maskParameters() { return maskParameters; }
                                    public byte[] padding() { return padding; }
                                    public FlagParameters realFlags() { return realFlags; }

                                    /**
                                     * value should be 0 or 255
                                     */
                                    public Integer realUserMaskBackground() { return realUserMaskBackground; }
                                    public BoundingBoxType realBoundingBox() { return realBoundingBox; }
                                    public PsdKaitai _root() { return _root; }
                                    public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerMaskAdjustmentLayer _parent() { return _parent; }
                                }
                                private int sizeOfData;
                                private LayerMaskAdjustmentLayerData data;
                                private PsdKaitai _root;
                                private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData _parent;
                                private byte[] _raw_data;
                                public int sizeOfData() { return sizeOfData; }
                                public LayerMaskAdjustmentLayerData data() { return data; }
                                public PsdKaitai _root() { return _root; }
                                public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData _parent() { return _parent; }
                                public byte[] _raw_data() { return _raw_data; }
                            }
                            public static class LayerBlendingRanges extends KaitaiStruct {
                                public static LayerBlendingRanges fromFile(String fileName) throws IOException {
                                    return new LayerBlendingRanges(new ByteBufferKaitaiStream(fileName));
                                }

                                public LayerBlendingRanges(KaitaiStream _io) {
                                    this(_io, null, null);
                                }

                                public LayerBlendingRanges(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData _parent) {
                                    this(_io, _parent, null);
                                }

                                public LayerBlendingRanges(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData _parent, PsdKaitai _root) {
                                    super(_io);
                                    this._parent = _parent;
                                    this._root = _root;
                                    _read();
                                }
                                private void _read() {
                                    this.sizeOfData = this._io.readS4be();
                                    this._raw_data = this._io.readBytes(sizeOfData());
                                    KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                    this.data = new LayerBlendingRangesData(_io__raw_data, this, _root);
                                }
                                public static class LayerBlendingRangesData extends KaitaiStruct {
                                    public static LayerBlendingRangesData fromFile(String fileName) throws IOException {
                                        return new LayerBlendingRangesData(new ByteBufferKaitaiStream(fileName));
                                    }

                                    public LayerBlendingRangesData(KaitaiStream _io) {
                                        this(_io, null, null);
                                    }

                                    public LayerBlendingRangesData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerBlendingRanges _parent) {
                                        this(_io, _parent, null);
                                    }

                                    public LayerBlendingRangesData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerBlendingRanges _parent, PsdKaitai _root) {
                                        super(_io);
                                        this._parent = _parent;
                                        this._root = _root;
                                        _read();
                                    }
                                    private void _read() {
                                        this.compositeGrayBlendRange = new ChannelRangeData(this._io, this, _root);
                                        this.channelRanges = new ArrayList<ChannelRangeData>();
                                        {
                                            int i = 0;
                                            while (!this._io.isEof()) {
                                                this.channelRanges.add(new ChannelRangeData(this._io, this, _root));
                                                i++;
                                            }
                                        }
                                    }
                                    public static class ChannelRangeData extends KaitaiStruct {
                                        public static ChannelRangeData fromFile(String fileName) throws IOException {
                                            return new ChannelRangeData(new ByteBufferKaitaiStream(fileName));
                                        }

                                        public ChannelRangeData(KaitaiStream _io) {
                                            this(_io, null, null);
                                        }

                                        public ChannelRangeData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerBlendingRanges.LayerBlendingRangesData _parent) {
                                            this(_io, _parent, null);
                                        }

                                        public ChannelRangeData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerBlendingRanges.LayerBlendingRangesData _parent, PsdKaitai _root) {
                                            super(_io);
                                            this._parent = _parent;
                                            this._root = _root;
                                            _read();
                                        }
                                        private void _read() {
                                            this.sourceRange = this._io.readBytes(4);
                                            this.destinationRange = this._io.readBytes(4);
                                        }
                                        private byte[] sourceRange;
                                        private byte[] destinationRange;
                                        private PsdKaitai _root;
                                        private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerBlendingRanges.LayerBlendingRangesData _parent;
                                        public byte[] sourceRange() { return sourceRange; }
                                        public byte[] destinationRange() { return destinationRange; }
                                        public PsdKaitai _root() { return _root; }
                                        public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerBlendingRanges.LayerBlendingRangesData _parent() { return _parent; }
                                    }
                                    private ChannelRangeData compositeGrayBlendRange;
                                    private ArrayList<ChannelRangeData> channelRanges;
                                    private PsdKaitai _root;
                                    private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerBlendingRanges _parent;
                                    public ChannelRangeData compositeGrayBlendRange() { return compositeGrayBlendRange; }
                                    public ArrayList<ChannelRangeData> channelRanges() { return channelRanges; }
                                    public PsdKaitai _root() { return _root; }
                                    public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData.LayerBlendingRanges _parent() { return _parent; }
                                }
                                private int sizeOfData;
                                private LayerBlendingRangesData data;
                                private PsdKaitai _root;
                                private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData _parent;
                                private byte[] _raw_data;
                                public int sizeOfData() { return sizeOfData; }
                                public LayerBlendingRangesData data() { return data; }
                                public PsdKaitai _root() { return _root; }
                                public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord.ExtraData _parent() { return _parent; }
                                public byte[] _raw_data() { return _raw_data; }
                            }
                            private LayerMaskAdjustmentLayer layerMaskData;
                            private LayerBlendingRanges layerBlendingRanges;
                            private PascalStringPaddedTo4ByteMultiple layerName;
                            private ArrayList<AdditionalLayerInformation> additionalLayerInformation;
                            private PsdKaitai _root;
                            private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord _parent;
                            public LayerMaskAdjustmentLayer layerMaskData() { return layerMaskData; }
                            public LayerBlendingRanges layerBlendingRanges() { return layerBlendingRanges; }
                            public PascalStringPaddedTo4ByteMultiple layerName() { return layerName; }
                            public ArrayList<AdditionalLayerInformation> additionalLayerInformation() { return additionalLayerInformation; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData.LayerRecord _parent() { return _parent; }
                        }
                        private BoundingBoxType boundingBox;
                        private short numberOfChannels;
                        private ArrayList<ChannelInformationRecord> channelInformation;
                        private BlendModeStructure blendMode;
                        private int opacity;
                        private ClippingModes clippingMode;
                        private LayerRecordFlags flags;
                        private byte[] padding;
                        private int sizeOfExtraDataFields;
                        private ExtraData extraData;
                        private PsdKaitai _root;
                        private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData _parent;
                        private byte[] _raw_extraData;
                        public BoundingBoxType boundingBox() { return boundingBox; }
                        public short numberOfChannels() { return numberOfChannels; }
                        public ArrayList<ChannelInformationRecord> channelInformation() { return channelInformation; }
                        public BlendModeStructure blendMode() { return blendMode; }

                        /**
                         * a value of 0 is transparent, value of 255 is opaque
                         */
                        public int opacity() { return opacity; }
                        public ClippingModes clippingMode() { return clippingMode; }
                        public LayerRecordFlags flags() { return flags; }
                        public byte[] padding() { return padding; }
                        public int sizeOfExtraDataFields() { return sizeOfExtraDataFields; }
                        public ExtraData extraData() { return extraData; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation.LayerInformationData _parent() { return _parent; }
                        public byte[] _raw_extraData() { return _raw_extraData; }
                    }
                    private short layerCount;
                    private ArrayList<LayerRecord> layerRecords;
                    private byte[] channelImageDataRecords;
                    private PsdKaitai _root;
                    private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation _parent;
                    public short layerCount() { return layerCount; }
                    public ArrayList<LayerRecord> layerRecords() { return layerRecords; }
                    public byte[] channelImageDataRecords() { return channelImageDataRecords; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.LayerInformation _parent() { return _parent; }
                }
                private int sizeOfData;
                private LayerInformationData data;
                private PsdKaitai _root;
                private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData _parent;
                private byte[] _raw_data;

                /**
                 * value should be an even number (have 2 as a factor)
                 */
                public int sizeOfData() { return sizeOfData; }
                public LayerInformationData data() { return data; }
                public PsdKaitai _root() { return _root; }
                public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData _parent() { return _parent; }
                public byte[] _raw_data() { return _raw_data; }
            }
            public static class GlobalLayerMaskInformation extends KaitaiStruct {
                public static GlobalLayerMaskInformation fromFile(String fileName) throws IOException {
                    return new GlobalLayerMaskInformation(new ByteBufferKaitaiStream(fileName));
                }

                public GlobalLayerMaskInformation(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public GlobalLayerMaskInformation(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData _parent) {
                    this(_io, _parent, null);
                }

                public GlobalLayerMaskInformation(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.sizeOfData = this._io.readS4be();
                    if (sizeOfData() != 0) {
                        this._raw_data = this._io.readBytes(sizeOfData());
                        KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                        this.data = new GlobalLayerMaskInformationData(_io__raw_data, this, _root);
                    }
                }
                public static class GlobalLayerMaskInformationData extends KaitaiStruct {
                    public static GlobalLayerMaskInformationData fromFile(String fileName) throws IOException {
                        return new GlobalLayerMaskInformationData(new ByteBufferKaitaiStream(fileName));
                    }

                    public enum Kinds {
                        COLOR_SELECTED(0),
                        COLOR_PROTECTED(1),
                        USE_VALUE_STORED_PER_LAYER(128);

                        private final long id;
                        Kinds(long id) { this.id = id; }
                        public long id() { return id; }
                        private static final Map<Long, Kinds> byId = new HashMap<Long, Kinds>(3);
                        static {
                            for (Kinds e : Kinds.values())
                                byId.put(e.id(), e);
                        }
                        public static Kinds byId(long id) { return byId.get(id); }
                    }

                    public GlobalLayerMaskInformationData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public GlobalLayerMaskInformationData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.GlobalLayerMaskInformation _parent) {
                        this(_io, _parent, null);
                    }

                    public GlobalLayerMaskInformationData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.GlobalLayerMaskInformation _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.color = new ColorStructure(this._io, this, _root);
                        this.opacity = this._io.readS2be();
                        this.kind = Kinds.byId(this._io.readU1());
                        this.padding = this._io.readBytes(1);
                    }
                    private ColorStructure color;
                    private short opacity;
                    private Kinds kind;
                    private byte[] padding;
                    private PsdKaitai _root;
                    private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.GlobalLayerMaskInformation _parent;
                    public ColorStructure color() { return color; }

                    /**
                     * value of 0 for transparent, value of 100 for opaque
                     */
                    public short opacity() { return opacity; }
                    public Kinds kind() { return kind; }
                    public byte[] padding() { return padding; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.GlobalLayerMaskInformation _parent() { return _parent; }
                }
                private int sizeOfData;
                private GlobalLayerMaskInformationData data;
                private PsdKaitai _root;
                private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData _parent;
                private byte[] _raw_data;
                public int sizeOfData() { return sizeOfData; }
                public GlobalLayerMaskInformationData data() { return data; }
                public PsdKaitai _root() { return _root; }
                public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData _parent() { return _parent; }
                public byte[] _raw_data() { return _raw_data; }
            }
            public static class AdditionalLayerInformation extends KaitaiStruct {
                public static AdditionalLayerInformation fromFile(String fileName) throws IOException {
                    return new AdditionalLayerInformation(new ByteBufferKaitaiStream(fileName));
                }

                public enum AdjustmentLayerTypes {
                    ANNOTATIONS(1097756271),
                    CONTENT_GENERATOR_EXTRA_DATA(1130841444),
                    FILTER_EFFECTS_2(1178954084),
                    FILTER_MASK(1179480939),
                    FILTER_EFFECTS_1(1180199268),
                    GRADIENT_FILL_SETTING(1197753964),
                    USER_MASK(1280144235),
                    SAVING_MERGED_TRANSPARENCY_2(1299460406),
                    SAVING_MERGED_TRANSPARENCY_3(1299460914),
                    SAVING_MERGED_TRANSPARENCY_1(1299477102),
                    PATTERNS_2(1348564018),
                    PATTERNS_3(1348564019),
                    PATTERNS_1(1348564084),
                    PATTERN_FILL_SETTING(1349797484),
                    PIXEL_SOURCE_DATA_2(1350062916),
                    PIXEL_SOURCE_DATA_1(1350062947),
                    SOLID_COLOR_SHEET_SETTING(1399800687),
                    SMART_OBJECT_LAYER_DATA(1399802949),
                    PLACED_LAYER_DATA(1399802980),
                    TEXT_ENGINE_DATA(1417180210),
                    TYPE_TOOL_OBJECT_SETTING(1417237352),
                    ARTBOARD_DATA_3(1633838180),
                    ANIMATION_EFFECTS(1634616920),
                    ARTBOARD_DATA_1(1634890850),
                    ARTBOARD_DATA_2(1634890852),
                    COLOR_BALANCE(1651273315),
                    BLACK_AND_WHITE(1651275624),
                    BRIGHTNESS_AND_CONTRAST(1651665268),
                    CHANNEL_BLENDING_RESTRICTIONS_SETTING(1651667828),
                    BLEND_CLIPPING_ELEMENTS(1668047468),
                    COLOR_LOOKUP(1668051532),
                    CURVES(1668641398),
                    EXPOSURE(1702391873),
                    FOREIGN_EFFECTS_ID(1717991529),
                    REFERENCE_POINT(1719169648),
                    GRADIENT_MAP(1735550061),
                    HUE_SATURATION_FOR_PHOTOSHOP_4(1752524064),
                    HUE_SATURATION_FOR_PHOTOSHOP_5_AND_LATER(1752524082),
                    BLEND_INTERIOR_ELEMENTS(1768842872),
                    KNOCKOUT_SETTING(1802398575),
                    SHEET_COLOR_SETTING(1818455154),
                    LEVELS(1818588780),
                    OBJECT_BASED_EFFECTS_LAYER_INFO(1818654770),
                    LAYER_MASK_AS_GLOBAL_MASK(1819109229),
                    LINKED_LAYER_2(1819175730),
                    LINKED_LAYER_3(1819175731),
                    LINKED_LAYER_1(1819175748),
                    LAYER_NAME_SOURCE_SETTING(1819177842),
                    EFFECTS_LAYER(1819428440),
                    SECTION_DIVIDER_SETTING(1819501428),
                    PROTECTED_SETTING(1819504742),
                    UNICODE_LAYER_NAME(1819635305),
                    LAYER_ID(1819896164),
                    LAYER_VERSION(1819899506),
                    CHANNEL_MIXER(1835628658),
                    INVERT(1853256308),
                    PHOTO_FILTER(1885890156),
                    PLACED_LAYER(1886145636),
                    POSTERIZE(1886352244),
                    UNICODE_PATH_NAMES(1886677107),
                    SELECTIVE_COLOR(1936026723),
                    METADATA_SETTING(1936223588),
                    PATTERN_DATA(1936224353),
                    USING_ALIGNED_RENDERING(1936601680),
                    THRESHOLD(1953002099),
                    TRANSPARENCY_SHAPES_LAYER(1953721465),
                    TYPE_TOOL_INFO(1954108264),
                    VIBRANCE(1986617921),
                    VECTOR_MASK_AS_GLOBAL_MASK(1986881389),
                    VECTOR_MASK_SETTING_1(1986884459),
                    VECTOR_ORIGINATION_DATA(1987012459),
                    VECTOR_STROKE_CONTENT_DATA(1987273575),
                    VECTOR_MASK_SETTING_2(1987276147),
                    VECTOR_STROKE_DATA(1987277931);

                    private final long id;
                    AdjustmentLayerTypes(long id) { this.id = id; }
                    public long id() { return id; }
                    private static final Map<Long, AdjustmentLayerTypes> byId = new HashMap<Long, AdjustmentLayerTypes>(74);
                    static {
                        for (AdjustmentLayerTypes e : AdjustmentLayerTypes.values())
                            byId.put(e.id(), e);
                    }
                    public static AdjustmentLayerTypes byId(long id) { return byId.get(id); }
                }

                public AdditionalLayerInformation(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public AdditionalLayerInformation(KaitaiStream _io, KaitaiStruct _parent) {
                    this(_io, _parent, null);
                }

                public AdditionalLayerInformation(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.signature = this._io.readBytes(4);
                    this.dataType = AdjustmentLayerTypes.byId(this._io.readU4be());
                    this.sizeOfData = this._io.readS4be();
                    {
                        AdjustmentLayerTypes on = dataType();
                        if (on != null) {
                            switch (dataType()) {
                            case PATTERN_FILL_SETTING: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new DescriptorResourceWithVersion(_io__raw_data, this, _root);
                                break;
                            }
                            case BLACK_AND_WHITE: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new DescriptorResourceWithVersion(_io__raw_data, this, _root);
                                break;
                            }
                            case UNICODE_PATH_NAMES: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new DescriptorResourceWithVersion(_io__raw_data, this, _root);
                                break;
                            }
                            case UNICODE_LAYER_NAME: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new UnicodeStringResource(_io__raw_data, this, _root);
                                break;
                            }
                            case BRIGHTNESS_AND_CONTRAST: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new BrightnessAndContrastData(_io__raw_data, this, _root);
                                break;
                            }
                            case LAYER_ID: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new LayerIdData(_io__raw_data, this, _root);
                                break;
                            }
                            case CONTENT_GENERATOR_EXTRA_DATA: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new DescriptorResourceWithVersion(_io__raw_data, this, _root);
                                break;
                            }
                            case EXPOSURE: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new ExposureData(_io__raw_data, this, _root);
                                break;
                            }
                            case ANIMATION_EFFECTS: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new DescriptorResourceWithVersion(_io__raw_data, this, _root);
                                break;
                            }
                            case ARTBOARD_DATA_2: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new DescriptorResourceWithVersion(_io__raw_data, this, _root);
                                break;
                            }
                            case VIBRANCE: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new DescriptorResourceWithVersion(_io__raw_data, this, _root);
                                break;
                            }
                            case COLOR_LOOKUP: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new ColorLookupData(_io__raw_data, this, _root);
                                break;
                            }
                            case VECTOR_STROKE_DATA: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new DescriptorResourceWithVersion(_io__raw_data, this, _root);
                                break;
                            }
                            case ARTBOARD_DATA_1: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new DescriptorResourceWithVersion(_io__raw_data, this, _root);
                                break;
                            }
                            case SOLID_COLOR_SHEET_SETTING: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new DescriptorResourceWithVersion(_io__raw_data, this, _root);
                                break;
                            }
                            case GRADIENT_FILL_SETTING: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new DescriptorResourceWithVersion(_io__raw_data, this, _root);
                                break;
                            }
                            case TYPE_TOOL_INFO: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new TypeToolInfoData(_io__raw_data, this, _root);
                                break;
                            }
                            case PIXEL_SOURCE_DATA_1: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new DescriptorResourceWithVersion(_io__raw_data, this, _root);
                                break;
                            }
                            case TYPE_TOOL_OBJECT_SETTING: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new TypeToolObjectSettingData(_io__raw_data, this, _root);
                                break;
                            }
                            case EFFECTS_LAYER: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new EffectsLayerData(_io__raw_data, this, _root);
                                break;
                            }
                            case PHOTO_FILTER: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new PhotoFilterData(_io__raw_data, this, _root);
                                break;
                            }
                            case ARTBOARD_DATA_3: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new DescriptorResourceWithVersion(_io__raw_data, this, _root);
                                break;
                            }
                            case CHANNEL_MIXER: {
                                this._raw_data = this._io.readBytes(sizeOfData());
                                KaitaiStream _io__raw_data = new ByteBufferKaitaiStream(_raw_data);
                                this.data = new ChannelMixerData(_io__raw_data, this, _root);
                                break;
                            }
                            default: {
                                this.data = this._io.readBytes(sizeOfData());
                                break;
                            }
                            }
                        } else {
                            this.data = this._io.readBytes(sizeOfData());
                        }
                    }
                }
                public static class TypeToolObjectSettingData extends KaitaiStruct {
                    public static TypeToolObjectSettingData fromFile(String fileName) throws IOException {
                        return new TypeToolObjectSettingData(new ByteBufferKaitaiStream(fileName));
                    }

                    public TypeToolObjectSettingData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public TypeToolObjectSettingData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent) {
                        this(_io, _parent, null);
                    }

                    public TypeToolObjectSettingData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.version = this._io.readS2be();
                        numbersForTransformInformation = new ArrayList<byte[]>(((Number) (6)).intValue());
                        for (int i = 0; i < 6; i++) {
                            this.numbersForTransformInformation.add(this._io.readBytes(8));
                        }
                        this.textVersion = this._io.readS2be();
                        this.descriptorVersion = this._io.readS4be();
                        this.textDataDescriptor = new DescriptorResource(this._io, this, _root);
                        this.warpVersion = this._io.readS2be();
                        if (warpVersion() == 1) {
                            this.descriptorVersion2 = this._io.readS4be();
                        }
                        if (warpVersion() == 1) {
                            this.wrapDataDescriptor = new DescriptorResource(this._io, this, _root);
                        }
                        this.boundingBox = new BoundingBoxType4x8(this._io, this, _root);
                    }
                    private short version;
                    private ArrayList<byte[]> numbersForTransformInformation;
                    private short textVersion;
                    private int descriptorVersion;
                    private DescriptorResource textDataDescriptor;
                    private short warpVersion;
                    private Integer descriptorVersion2;
                    private DescriptorResource wrapDataDescriptor;
                    private BoundingBoxType4x8 boundingBox;
                    private PsdKaitai _root;
                    private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent;

                    /**
                     * value should be 1
                     */
                    public short version() { return version; }
                    public ArrayList<byte[]> numbersForTransformInformation() { return numbersForTransformInformation; }

                    /**
                     * value should be 50
                     */
                    public short textVersion() { return textVersion; }

                    /**
                     * value should be 16
                     */
                    public int descriptorVersion() { return descriptorVersion; }
                    public DescriptorResource textDataDescriptor() { return textDataDescriptor; }

                    /**
                     * value should be 1
                     */
                    public short warpVersion() { return warpVersion; }

                    /**
                     * value should be 16
                     */
                    public Integer descriptorVersion2() { return descriptorVersion2; }
                    public DescriptorResource wrapDataDescriptor() { return wrapDataDescriptor; }
                    public BoundingBoxType4x8 boundingBox() { return boundingBox; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent() { return _parent; }
                }
                public static class TypeToolInfoData extends KaitaiStruct {
                    public static TypeToolInfoData fromFile(String fileName) throws IOException {
                        return new TypeToolInfoData(new ByteBufferKaitaiStream(fileName));
                    }

                    public TypeToolInfoData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public TypeToolInfoData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent) {
                        this(_io, _parent, null);
                    }

                    public TypeToolInfoData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.version = this._io.readS2be();
                        numbersForTransformInformation = new ArrayList<byte[]>(((Number) (6)).intValue());
                        for (int i = 0; i < 6; i++) {
                            this.numbersForTransformInformation.add(this._io.readBytes(8));
                        }
                        this.fontInformation = new FontInformation(this._io, this, _root);
                        this.styleInformation = new StyleInformation(this._io, this, _root);
                        this.textInformation = new TextInformation(this._io, this, _root);
                        this.colorInformation = new ColorInformation(this._io, this, _root);
                    }
                    public static class FontInformation extends KaitaiStruct {
                        public static FontInformation fromFile(String fileName) throws IOException {
                            return new FontInformation(new ByteBufferKaitaiStream(fileName));
                        }

                        public FontInformation(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public FontInformation(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent) {
                            this(_io, _parent, null);
                        }

                        public FontInformation(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.version = this._io.readS2be();
                            this.numberOfFaces = this._io.readS2be();
                            faces = new ArrayList<FaceInformation>(((Number) (numberOfFaces())).intValue());
                            for (int i = 0; i < numberOfFaces(); i++) {
                                this.faces.add(new FaceInformation(this._io, this, _root));
                            }
                        }
                        public static class FaceInformation extends KaitaiStruct {
                            public static FaceInformation fromFile(String fileName) throws IOException {
                                return new FaceInformation(new ByteBufferKaitaiStream(fileName));
                            }

                            public FaceInformation(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public FaceInformation(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData.FontInformation _parent) {
                                this(_io, _parent, null);
                            }

                            public FaceInformation(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData.FontInformation _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.markValue = this._io.readBytes(2);
                                this.fontTypeData = this._io.readBytes(4);
                                this.fontName = new PascalStringPaddedTo2ByteMultiple(this._io, this, _root);
                                this.fontFamilyName = new PascalStringPaddedTo2ByteMultiple(this._io, this, _root);
                                this.fontStyleName = new PascalStringPaddedTo2ByteMultiple(this._io, this, _root);
                                this.scriptValue = this._io.readBytes(2);
                                this.numberOfDesignAxesVectorToFollow = this._io.readS4be();
                                designAxesVectorValues = new ArrayList<byte[]>(((Number) (numberOfDesignAxesVectorToFollow())).intValue());
                                for (int i = 0; i < numberOfDesignAxesVectorToFollow(); i++) {
                                    this.designAxesVectorValues.add(this._io.readBytes(4));
                                }
                            }
                            private byte[] markValue;
                            private byte[] fontTypeData;
                            private PascalStringPaddedTo2ByteMultiple fontName;
                            private PascalStringPaddedTo2ByteMultiple fontFamilyName;
                            private PascalStringPaddedTo2ByteMultiple fontStyleName;
                            private byte[] scriptValue;
                            private int numberOfDesignAxesVectorToFollow;
                            private ArrayList<byte[]> designAxesVectorValues;
                            private PsdKaitai _root;
                            private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData.FontInformation _parent;
                            public byte[] markValue() { return markValue; }
                            public byte[] fontTypeData() { return fontTypeData; }
                            public PascalStringPaddedTo2ByteMultiple fontName() { return fontName; }
                            public PascalStringPaddedTo2ByteMultiple fontFamilyName() { return fontFamilyName; }
                            public PascalStringPaddedTo2ByteMultiple fontStyleName() { return fontStyleName; }
                            public byte[] scriptValue() { return scriptValue; }
                            public int numberOfDesignAxesVectorToFollow() { return numberOfDesignAxesVectorToFollow; }
                            public ArrayList<byte[]> designAxesVectorValues() { return designAxesVectorValues; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData.FontInformation _parent() { return _parent; }
                        }
                        private short version;
                        private short numberOfFaces;
                        private ArrayList<FaceInformation> faces;
                        private PsdKaitai _root;
                        private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent;

                        /**
                         * value should be 6
                         */
                        public short version() { return version; }
                        public short numberOfFaces() { return numberOfFaces; }
                        public ArrayList<FaceInformation> faces() { return faces; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent() { return _parent; }
                    }
                    public static class StyleInformation extends KaitaiStruct {
                        public static StyleInformation fromFile(String fileName) throws IOException {
                            return new StyleInformation(new ByteBufferKaitaiStream(fileName));
                        }

                        public StyleInformation(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public StyleInformation(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent) {
                            this(_io, _parent, null);
                        }

                        public StyleInformation(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.numberOfStyles = this._io.readS2be();
                            styles = new ArrayList<StyleInformationData>(((Number) (numberOfStyles())).intValue());
                            for (int i = 0; i < numberOfStyles(); i++) {
                                this.styles.add(new StyleInformationData(this._io, this, _root));
                            }
                        }
                        public static class StyleInformationData extends KaitaiStruct {
                            public static StyleInformationData fromFile(String fileName) throws IOException {
                                return new StyleInformationData(new ByteBufferKaitaiStream(fileName));
                            }

                            public StyleInformationData(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public StyleInformationData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData.StyleInformation _parent) {
                                this(_io, _parent, null);
                            }

                            public StyleInformationData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData.StyleInformation _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.markValue = this._io.readBytes(2);
                                this.faceMarkValue = this._io.readBytes(2);
                                this.sizeValue = this._io.readBytes(4);
                                this.trackingValue = this._io.readBytes(4);
                                this.kerningValue = this._io.readBytes(4);
                                this.leadingValue = this._io.readBytes(4);
                                this.baseShiftValue = this._io.readBytes(4);
                                this.autoKernOnOff = this._io.readBytes(1);
                                this.rotateUpDown = this._io.readBytes(1);
                            }
                            private byte[] markValue;
                            private byte[] faceMarkValue;
                            private byte[] sizeValue;
                            private byte[] trackingValue;
                            private byte[] kerningValue;
                            private byte[] leadingValue;
                            private byte[] baseShiftValue;
                            private byte[] autoKernOnOff;
                            private byte[] rotateUpDown;
                            private PsdKaitai _root;
                            private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData.StyleInformation _parent;
                            public byte[] markValue() { return markValue; }
                            public byte[] faceMarkValue() { return faceMarkValue; }
                            public byte[] sizeValue() { return sizeValue; }
                            public byte[] trackingValue() { return trackingValue; }
                            public byte[] kerningValue() { return kerningValue; }
                            public byte[] leadingValue() { return leadingValue; }
                            public byte[] baseShiftValue() { return baseShiftValue; }
                            public byte[] autoKernOnOff() { return autoKernOnOff; }
                            public byte[] rotateUpDown() { return rotateUpDown; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData.StyleInformation _parent() { return _parent; }
                        }
                        private short numberOfStyles;
                        private ArrayList<StyleInformationData> styles;
                        private PsdKaitai _root;
                        private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent;
                        public short numberOfStyles() { return numberOfStyles; }
                        public ArrayList<StyleInformationData> styles() { return styles; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent() { return _parent; }
                    }
                    public static class TextInformation extends KaitaiStruct {
                        public static TextInformation fromFile(String fileName) throws IOException {
                            return new TextInformation(new ByteBufferKaitaiStream(fileName));
                        }

                        public TextInformation(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public TextInformation(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent) {
                            this(_io, _parent, null);
                        }

                        public TextInformation(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.typeValue = this._io.readBytes(2);
                            this.scalingFactorValue = this._io.readBytes(4);
                            this.characterCountValue = this._io.readBytes(4);
                            this.horizontalPlacement = this._io.readBytes(4);
                            this.verticalPlacement = this._io.readBytes(4);
                            this.selectStartValue = this._io.readBytes(4);
                            this.selectEndValue = this._io.readBytes(4);
                            this.numberOfLines = this._io.readS2be();
                            lines = new ArrayList<TextLine>(((Number) (numberOfLines())).intValue());
                            for (int i = 0; i < numberOfLines(); i++) {
                                this.lines.add(new TextLine(this._io, this, _root));
                            }
                        }
                        public static class TextLine extends KaitaiStruct {
                            public static TextLine fromFile(String fileName) throws IOException {
                                return new TextLine(new ByteBufferKaitaiStream(fileName));
                            }

                            public TextLine(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public TextLine(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData.TextInformation _parent) {
                                this(_io, _parent, null);
                            }

                            public TextLine(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData.TextInformation _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.characterCountValue = this._io.readBytes(4);
                                this.orientationValue = this._io.readBytes(2);
                                this.alignmentValue = this._io.readBytes(2);
                                this.actualCharacter = this._io.readBytes(2);
                                this.styleValue = this._io.readBytes(2);
                            }
                            private byte[] characterCountValue;
                            private byte[] orientationValue;
                            private byte[] alignmentValue;
                            private byte[] actualCharacter;
                            private byte[] styleValue;
                            private PsdKaitai _root;
                            private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData.TextInformation _parent;
                            public byte[] characterCountValue() { return characterCountValue; }
                            public byte[] orientationValue() { return orientationValue; }
                            public byte[] alignmentValue() { return alignmentValue; }
                            public byte[] actualCharacter() { return actualCharacter; }
                            public byte[] styleValue() { return styleValue; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData.TextInformation _parent() { return _parent; }
                        }
                        private byte[] typeValue;
                        private byte[] scalingFactorValue;
                        private byte[] characterCountValue;
                        private byte[] horizontalPlacement;
                        private byte[] verticalPlacement;
                        private byte[] selectStartValue;
                        private byte[] selectEndValue;
                        private short numberOfLines;
                        private ArrayList<TextLine> lines;
                        private PsdKaitai _root;
                        private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent;
                        public byte[] typeValue() { return typeValue; }
                        public byte[] scalingFactorValue() { return scalingFactorValue; }
                        public byte[] characterCountValue() { return characterCountValue; }
                        public byte[] horizontalPlacement() { return horizontalPlacement; }
                        public byte[] verticalPlacement() { return verticalPlacement; }
                        public byte[] selectStartValue() { return selectStartValue; }
                        public byte[] selectEndValue() { return selectEndValue; }
                        public short numberOfLines() { return numberOfLines; }
                        public ArrayList<TextLine> lines() { return lines; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent() { return _parent; }
                    }
                    public static class ColorInformation extends KaitaiStruct {
                        public static ColorInformation fromFile(String fileName) throws IOException {
                            return new ColorInformation(new ByteBufferKaitaiStream(fileName));
                        }

                        public ColorInformation(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public ColorInformation(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent) {
                            this(_io, _parent, null);
                        }

                        public ColorInformation(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.color = new ColorStructure(this._io, this, _root);
                            this.antiAliasOnOff = this._io.readBytes(1);
                        }
                        private ColorStructure color;
                        private byte[] antiAliasOnOff;
                        private PsdKaitai _root;
                        private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent;
                        public ColorStructure color() { return color; }
                        public byte[] antiAliasOnOff() { return antiAliasOnOff; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolInfoData _parent() { return _parent; }
                    }
                    private short version;
                    private ArrayList<byte[]> numbersForTransformInformation;
                    private FontInformation fontInformation;
                    private StyleInformation styleInformation;
                    private TextInformation textInformation;
                    private ColorInformation colorInformation;
                    private PsdKaitai _root;
                    private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent;

                    /**
                     * value should be 1
                     */
                    public short version() { return version; }

                    /**
                     * each number has a double precision type
                     */
                    public ArrayList<byte[]> numbersForTransformInformation() { return numbersForTransformInformation; }
                    public FontInformation fontInformation() { return fontInformation; }
                    public StyleInformation styleInformation() { return styleInformation; }
                    public TextInformation textInformation() { return textInformation; }
                    public ColorInformation colorInformation() { return colorInformation; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent() { return _parent; }
                }
                public static class ExposureData extends KaitaiStruct {
                    public static ExposureData fromFile(String fileName) throws IOException {
                        return new ExposureData(new ByteBufferKaitaiStream(fileName));
                    }

                    public ExposureData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public ExposureData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent) {
                        this(_io, _parent, null);
                    }

                    public ExposureData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.version = this._io.readS2be();
                        this.exposure = this._io.readBytes(4);
                        this.offset = this._io.readBytes(4);
                        this.gamma = this._io.readBytes(4);
                    }
                    private short version;
                    private byte[] exposure;
                    private byte[] offset;
                    private byte[] gamma;
                    private PsdKaitai _root;
                    private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent;

                    /**
                     * value should be 1
                     */
                    public short version() { return version; }
                    public byte[] exposure() { return exposure; }
                    public byte[] offset() { return offset; }
                    public byte[] gamma() { return gamma; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent() { return _parent; }
                }
                public static class EffectsLayerData extends KaitaiStruct {
                    public static EffectsLayerData fromFile(String fileName) throws IOException {
                        return new EffectsLayerData(new ByteBufferKaitaiStream(fileName));
                    }

                    public EffectsLayerData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public EffectsLayerData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent) {
                        this(_io, _parent, null);
                    }

                    public EffectsLayerData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.version = this._io.readS2be();
                        this.numberOfEffects = this._io.readS2be();
                        effects = new ArrayList<Effect>(((Number) (numberOfEffects())).intValue());
                        for (int i = 0; i < numberOfEffects(); i++) {
                            this.effects.add(new Effect(this._io, this, _root));
                        }
                    }
                    public static class Effect extends KaitaiStruct {
                        public static Effect fromFile(String fileName) throws IOException {
                            return new Effect(new ByteBufferKaitaiStream(fileName));
                        }

                        public enum EffectTypes {
                            BEVEL(1650816620),
                            COMMON_STATE(1668116051),
                            DROP_SHADOW(1685283959),
                            INNER_GLOW(1768385655),
                            INNER_SHADOW(1769170039),
                            OUTER_GLOW(1869048951),
                            SOLID_FILL(1936680553);

                            private final long id;
                            EffectTypes(long id) { this.id = id; }
                            public long id() { return id; }
                            private static final Map<Long, EffectTypes> byId = new HashMap<Long, EffectTypes>(7);
                            static {
                                for (EffectTypes e : EffectTypes.values())
                                    byId.put(e.id(), e);
                            }
                            public static EffectTypes byId(long id) { return byId.get(id); }
                        }

                        public Effect(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public Effect(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData _parent) {
                            this(_io, _parent, null);
                        }

                        public Effect(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.signature = this._io.readBytes(4);
                            if (!(Arrays.equals(signature(), new byte[] { 56, 66, 73, 77 }))) {
                                throw new KaitaiStream.ValidationNotEqualError(new byte[] { 56, 66, 73, 77 }, signature(), _io(), "/types/layer_and_mask_information/types/layer_and_mask_information_data/types/additional_layer_information/types/effects_layer_data/types/effect/seq/0");
                            }
                            this.type = EffectTypes.byId(this._io.readU4be());
                            {
                                EffectTypes on = type();
                                if (on != null) {
                                    switch (type()) {
                                    case BEVEL: {
                                        this.data = new BevelData(this._io, this, _root);
                                        break;
                                    }
                                    case INNER_SHADOW: {
                                        this.data = new ShadowData(this._io, this, _root);
                                        break;
                                    }
                                    case COMMON_STATE: {
                                        this.data = new CommonStateData(this._io, this, _root);
                                        break;
                                    }
                                    case INNER_GLOW: {
                                        this.data = new InnerGlowData(this._io, this, _root);
                                        break;
                                    }
                                    case SOLID_FILL: {
                                        this.data = new SolidFillData(this._io, this, _root);
                                        break;
                                    }
                                    case DROP_SHADOW: {
                                        this.data = new ShadowData(this._io, this, _root);
                                        break;
                                    }
                                    case OUTER_GLOW: {
                                        this.data = new OuterGlowData(this._io, this, _root);
                                        break;
                                    }
                                    }
                                }
                            }
                        }
                        public static class SolidFillData extends KaitaiStruct {
                            public static SolidFillData fromFile(String fileName) throws IOException {
                                return new SolidFillData(new ByteBufferKaitaiStream(fileName));
                            }

                            public SolidFillData(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public SolidFillData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent) {
                                this(_io, _parent, null);
                            }

                            public SolidFillData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.sizeOfFollowingData = this._io.readS4be();
                                this.version = this._io.readS4be();
                                this.keyForBlendMode = PsdKaitai.BlendModes.byId(this._io.readS4be());
                                this.colorSpace = new ColorStructure(this._io, this, _root);
                                this.opacity = this._io.readBytes(1);
                                this.effectEnabled = this._io.readBytes(1);
                                this.nativeColorSpace = new ColorStructure(this._io, this, _root);
                            }
                            private int sizeOfFollowingData;
                            private int version;
                            private BlendModes keyForBlendMode;
                            private ColorStructure colorSpace;
                            private byte[] opacity;
                            private byte[] effectEnabled;
                            private ColorStructure nativeColorSpace;
                            private PsdKaitai _root;
                            private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent;

                            /**
                             * value should be 34
                             */
                            public int sizeOfFollowingData() { return sizeOfFollowingData; }

                            /**
                             * value should be 2
                             */
                            public int version() { return version; }
                            public BlendModes keyForBlendMode() { return keyForBlendMode; }
                            public ColorStructure colorSpace() { return colorSpace; }
                            public byte[] opacity() { return opacity; }
                            public byte[] effectEnabled() { return effectEnabled; }
                            public ColorStructure nativeColorSpace() { return nativeColorSpace; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent() { return _parent; }
                        }
                        public static class BevelData extends KaitaiStruct {
                            public static BevelData fromFile(String fileName) throws IOException {
                                return new BevelData(new ByteBufferKaitaiStream(fileName));
                            }

                            public BevelData(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public BevelData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent) {
                                this(_io, _parent, null);
                            }

                            public BevelData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.sizeOfFollowingData = this._io.readS4be();
                                this.version = this._io.readS4be();
                                this.angle = this._io.readBytes(4);
                                this.strength = this._io.readBytes(4);
                                this.blurValue = this._io.readBytes(4);
                                this.highlightBlendMode = new BlendModeStructure(this._io, this, _root);
                                this.shadowBlendMode = new BlendModeStructure(this._io, this, _root);
                                this.highlightColor = new ColorStructure(this._io, this, _root);
                                this.shadowColor = new ColorStructure(this._io, this, _root);
                                this.bevelStyle = this._io.readBytes(1);
                                this.highlightOpacity = this._io.readBytes(1);
                                this.shadowOpacity = this._io.readBytes(1);
                                this.effectEnabled = this._io.readBytes(1);
                                this.useThisAngleInAllOfTheLayerEffects = this._io.readBytes(1);
                                this.upOrDown = this._io.readBytes(1);
                                if (version() == 2) {
                                    this.realHighlightColor = new ColorStructure(this._io, this, _root);
                                }
                                if (version() == 2) {
                                    this.realShadowColor = new ColorStructure(this._io, this, _root);
                                }
                            }
                            private int sizeOfFollowingData;
                            private int version;
                            private byte[] angle;
                            private byte[] strength;
                            private byte[] blurValue;
                            private BlendModeStructure highlightBlendMode;
                            private BlendModeStructure shadowBlendMode;
                            private ColorStructure highlightColor;
                            private ColorStructure shadowColor;
                            private byte[] bevelStyle;
                            private byte[] highlightOpacity;
                            private byte[] shadowOpacity;
                            private byte[] effectEnabled;
                            private byte[] useThisAngleInAllOfTheLayerEffects;
                            private byte[] upOrDown;
                            private ColorStructure realHighlightColor;
                            private ColorStructure realShadowColor;
                            private PsdKaitai _root;
                            private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent;

                            /**
                             * value should be 58 for Photoshop v5 or 78 for Photoshop v5.5
                             */
                            public int sizeOfFollowingData() { return sizeOfFollowingData; }

                            /**
                             * value should be 0 for Photoshop v5 or 2 for Photoshop v5.5
                             */
                            public int version() { return version; }

                            /**
                             * unit of this value is degrees
                             */
                            public byte[] angle() { return angle; }

                            /**
                             * unit of this value is number of pixels in depth
                             */
                            public byte[] strength() { return strength; }

                            /**
                             * unit of this value is number of pixels
                             */
                            public byte[] blurValue() { return blurValue; }
                            public BlendModeStructure highlightBlendMode() { return highlightBlendMode; }
                            public BlendModeStructure shadowBlendMode() { return shadowBlendMode; }
                            public ColorStructure highlightColor() { return highlightColor; }
                            public ColorStructure shadowColor() { return shadowColor; }
                            public byte[] bevelStyle() { return bevelStyle; }

                            /**
                             * unit of this value is a percentage
                             */
                            public byte[] highlightOpacity() { return highlightOpacity; }

                            /**
                             * unit of this value is a percentage
                             */
                            public byte[] shadowOpacity() { return shadowOpacity; }
                            public byte[] effectEnabled() { return effectEnabled; }
                            public byte[] useThisAngleInAllOfTheLayerEffects() { return useThisAngleInAllOfTheLayerEffects; }
                            public byte[] upOrDown() { return upOrDown; }
                            public ColorStructure realHighlightColor() { return realHighlightColor; }
                            public ColorStructure realShadowColor() { return realShadowColor; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent() { return _parent; }
                        }
                        public static class CommonStateData extends KaitaiStruct {
                            public static CommonStateData fromFile(String fileName) throws IOException {
                                return new CommonStateData(new ByteBufferKaitaiStream(fileName));
                            }

                            public CommonStateData(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public CommonStateData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent) {
                                this(_io, _parent, null);
                            }

                            public CommonStateData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.sizeOfFollowingData = this._io.readS4be();
                                this.version = this._io.readS4be();
                                this.visible = this._io.readBytes(1);
                                this.unused = this._io.readBytes(2);
                                if (!(Arrays.equals(unused(), new byte[] { 0, 0 }))) {
                                    throw new KaitaiStream.ValidationNotEqualError(new byte[] { 0, 0 }, unused(), _io(), "/types/layer_and_mask_information/types/layer_and_mask_information_data/types/additional_layer_information/types/effects_layer_data/types/effect/types/common_state_data/seq/3");
                                }
                            }
                            private int sizeOfFollowingData;
                            private int version;
                            private byte[] visible;
                            private byte[] unused;
                            private PsdKaitai _root;
                            private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent;

                            /**
                             * value should be 7
                             */
                            public int sizeOfFollowingData() { return sizeOfFollowingData; }

                            /**
                             * value should be 0
                             */
                            public int version() { return version; }

                            /**
                             * value should be true
                             */
                            public byte[] visible() { return visible; }
                            public byte[] unused() { return unused; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent() { return _parent; }
                        }
                        public static class ShadowData extends KaitaiStruct {
                            public static ShadowData fromFile(String fileName) throws IOException {
                                return new ShadowData(new ByteBufferKaitaiStream(fileName));
                            }

                            public ShadowData(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public ShadowData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent) {
                                this(_io, _parent, null);
                            }

                            public ShadowData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.sizeOfFollowingData = this._io.readS4be();
                                this.version = this._io.readS4be();
                                this.blurValue = this._io.readBytes(4);
                                this.intensity = this._io.readBytes(4);
                                this.angle = this._io.readBytes(4);
                                this.distance = this._io.readBytes(4);
                                this.color = new ColorStructure(this._io, this, _root);
                                this.blendMode = new BlendModeStructure(this._io, this, _root);
                                this.effectEnabled = this._io.readBytes(1);
                                this.useThisAngleInAllOfTheLayerEffects = this._io.readBytes(1);
                                this.opacity = this._io.readBytes(1);
                                this.nativeColor = new ColorStructure(this._io, this, _root);
                            }
                            private int sizeOfFollowingData;
                            private int version;
                            private byte[] blurValue;
                            private byte[] intensity;
                            private byte[] angle;
                            private byte[] distance;
                            private ColorStructure color;
                            private BlendModeStructure blendMode;
                            private byte[] effectEnabled;
                            private byte[] useThisAngleInAllOfTheLayerEffects;
                            private byte[] opacity;
                            private ColorStructure nativeColor;
                            private PsdKaitai _root;
                            private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent;

                            /**
                             * value should be 41 or 51 depending on the value of the version field
                             */
                            public int sizeOfFollowingData() { return sizeOfFollowingData; }

                            /**
                             * value should be 0 for Photoshop v5 or 2 for Photoshop v5.5
                             */
                            public int version() { return version; }

                            /**
                             * unit of this value is number of pixels
                             */
                            public byte[] blurValue() { return blurValue; }

                            /**
                             * unit of this value is a percentage
                             */
                            public byte[] intensity() { return intensity; }

                            /**
                             * unit of this value is degrees
                             */
                            public byte[] angle() { return angle; }

                            /**
                             * unit of this value is number of pixels
                             */
                            public byte[] distance() { return distance; }
                            public ColorStructure color() { return color; }
                            public BlendModeStructure blendMode() { return blendMode; }
                            public byte[] effectEnabled() { return effectEnabled; }
                            public byte[] useThisAngleInAllOfTheLayerEffects() { return useThisAngleInAllOfTheLayerEffects; }

                            /**
                             * unit of this value is a percentage
                             */
                            public byte[] opacity() { return opacity; }
                            public ColorStructure nativeColor() { return nativeColor; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent() { return _parent; }
                        }
                        public static class OuterGlowData extends KaitaiStruct {
                            public static OuterGlowData fromFile(String fileName) throws IOException {
                                return new OuterGlowData(new ByteBufferKaitaiStream(fileName));
                            }

                            public OuterGlowData(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public OuterGlowData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent) {
                                this(_io, _parent, null);
                            }

                            public OuterGlowData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.sizeOfFollowingData = this._io.readS4be();
                                this.version = this._io.readS4be();
                                this.blurValue = this._io.readBytes(4);
                                this.intensity = this._io.readBytes(4);
                                this.color = new ColorStructure(this._io, this, _root);
                                this.blendMode = new BlendModeStructure(this._io, this, _root);
                                this.effectEnabled = this._io.readBytes(1);
                                this.opacity = this._io.readBytes(1);
                                if (version() == 2) {
                                    this.nativeColorSpace = new ColorStructure(this._io, this, _root);
                                }
                            }
                            private int sizeOfFollowingData;
                            private int version;
                            private byte[] blurValue;
                            private byte[] intensity;
                            private ColorStructure color;
                            private BlendModeStructure blendMode;
                            private byte[] effectEnabled;
                            private byte[] opacity;
                            private ColorStructure nativeColorSpace;
                            private PsdKaitai _root;
                            private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent;

                            /**
                             * value should be 32 for Photoshop v5 or 42 for Photoshop v5.5
                             */
                            public int sizeOfFollowingData() { return sizeOfFollowingData; }

                            /**
                             * value should be 0 for Photoshop v5 or 2 for Photoshop v5.5
                             */
                            public int version() { return version; }

                            /**
                             * unit of this value is number of pixels
                             */
                            public byte[] blurValue() { return blurValue; }

                            /**
                             * unit of this value is a percentage
                             */
                            public byte[] intensity() { return intensity; }
                            public ColorStructure color() { return color; }
                            public BlendModeStructure blendMode() { return blendMode; }
                            public byte[] effectEnabled() { return effectEnabled; }

                            /**
                             * unit of this value is a percentage
                             */
                            public byte[] opacity() { return opacity; }
                            public ColorStructure nativeColorSpace() { return nativeColorSpace; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent() { return _parent; }
                        }
                        public static class InnerGlowData extends KaitaiStruct {
                            public static InnerGlowData fromFile(String fileName) throws IOException {
                                return new InnerGlowData(new ByteBufferKaitaiStream(fileName));
                            }

                            public InnerGlowData(KaitaiStream _io) {
                                this(_io, null, null);
                            }

                            public InnerGlowData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent) {
                                this(_io, _parent, null);
                            }

                            public InnerGlowData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent, PsdKaitai _root) {
                                super(_io);
                                this._parent = _parent;
                                this._root = _root;
                                _read();
                            }
                            private void _read() {
                                this.sizeOfFollowingData = this._io.readS4be();
                                this.version = this._io.readS4be();
                                this.blurValue = this._io.readBytes(4);
                                this.intensity = this._io.readBytes(4);
                                this.color = new ColorStructure(this._io, this, _root);
                                this.blendMode = new BlendModeStructure(this._io, this, _root);
                                this.effectEnabled = this._io.readBytes(1);
                                this.opacity = this._io.readBytes(1);
                                if (version() == 2) {
                                    this.invert = this._io.readBytes(1);
                                }
                                if (version() == 2) {
                                    this.nativeColorSpace = new ColorStructure(this._io, this, _root);
                                }
                            }
                            private int sizeOfFollowingData;
                            private int version;
                            private byte[] blurValue;
                            private byte[] intensity;
                            private ColorStructure color;
                            private BlendModeStructure blendMode;
                            private byte[] effectEnabled;
                            private byte[] opacity;
                            private byte[] invert;
                            private ColorStructure nativeColorSpace;
                            private PsdKaitai _root;
                            private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent;

                            /**
                             * value should be 32 for Photoshop v5 or 43 for Photoshop v5.5
                             */
                            public int sizeOfFollowingData() { return sizeOfFollowingData; }

                            /**
                             * value should be 0 for Photoshop v5 or 2 for Photoshop v5.5
                             */
                            public int version() { return version; }

                            /**
                             * unit of this value is number of pixels
                             */
                            public byte[] blurValue() { return blurValue; }

                            /**
                             * unit of this value is a percentage
                             */
                            public byte[] intensity() { return intensity; }
                            public ColorStructure color() { return color; }
                            public BlendModeStructure blendMode() { return blendMode; }
                            public byte[] effectEnabled() { return effectEnabled; }

                            /**
                             * unit of this value is a percentage
                             */
                            public byte[] opacity() { return opacity; }
                            public byte[] invert() { return invert; }
                            public ColorStructure nativeColorSpace() { return nativeColorSpace; }
                            public PsdKaitai _root() { return _root; }
                            public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData.Effect _parent() { return _parent; }
                        }
                        private byte[] signature;
                        private EffectTypes type;
                        private KaitaiStruct data;
                        private PsdKaitai _root;
                        private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData _parent;
                        public byte[] signature() { return signature; }
                        public EffectTypes type() { return type; }
                        public KaitaiStruct data() { return data; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.EffectsLayerData _parent() { return _parent; }
                    }
                    private short version;
                    private short numberOfEffects;
                    private ArrayList<Effect> effects;
                    private PsdKaitai _root;
                    private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent;

                    /**
                     * value should be 0
                     */
                    public short version() { return version; }

                    /**
                     * value may be 6 for Photoshop v5 and v6 or 7 for Photoshop v7
                     */
                    public short numberOfEffects() { return numberOfEffects; }
                    public ArrayList<Effect> effects() { return effects; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent() { return _parent; }
                }
                public static class ColorLookupData extends KaitaiStruct {
                    public static ColorLookupData fromFile(String fileName) throws IOException {
                        return new ColorLookupData(new ByteBufferKaitaiStream(fileName));
                    }

                    public ColorLookupData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public ColorLookupData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent) {
                        this(_io, _parent, null);
                    }

                    public ColorLookupData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.version = this._io.readS2be();
                        this.descriptorVersion = this._io.readS4be();
                        this.descriptor = new DescriptorResource(this._io, this, _root);
                    }
                    private short version;
                    private int descriptorVersion;
                    private DescriptorResource descriptor;
                    private PsdKaitai _root;
                    private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent;

                    /**
                     * value should be 1
                     */
                    public short version() { return version; }
                    public int descriptorVersion() { return descriptorVersion; }
                    public DescriptorResource descriptor() { return descriptor; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent() { return _parent; }
                }
                public static class ObjectBasedEffectsLayerInfoData extends KaitaiStruct {
                    public static ObjectBasedEffectsLayerInfoData fromFile(String fileName) throws IOException {
                        return new ObjectBasedEffectsLayerInfoData(new ByteBufferKaitaiStream(fileName));
                    }

                    public ObjectBasedEffectsLayerInfoData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public ObjectBasedEffectsLayerInfoData(KaitaiStream _io, KaitaiStruct _parent) {
                        this(_io, _parent, null);
                    }

                    public ObjectBasedEffectsLayerInfoData(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.version = this._io.readS4be();
                        this.descriptorVersion = this._io.readS4be();
                        this.descriptor = new DescriptorResource(this._io, this, _root);
                    }
                    private int version;
                    private int descriptorVersion;
                    private DescriptorResource descriptor;
                    private PsdKaitai _root;
                    private KaitaiStruct _parent;

                    /**
                     * value should be 0
                     */
                    public int version() { return version; }
                    public int descriptorVersion() { return descriptorVersion; }
                    public DescriptorResource descriptor() { return descriptor; }
                    public PsdKaitai _root() { return _root; }
                    public KaitaiStruct _parent() { return _parent; }
                }
                public static class PhotoFilterData extends KaitaiStruct {
                    public static PhotoFilterData fromFile(String fileName) throws IOException {
                        return new PhotoFilterData(new ByteBufferKaitaiStream(fileName));
                    }

                    public PhotoFilterData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public PhotoFilterData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent) {
                        this(_io, _parent, null);
                    }

                    public PhotoFilterData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.version = this._io.readS2be();
                        if (version() == 3) {
                            this.xyzColor = new XyzColor(this._io, this, _root);
                        }
                        if (version() == 2) {
                            this.color = new ColorStructure(this._io, this, _root);
                        }
                        this.density = this._io.readBytes(4);
                        this.preserveLuminosity = this._io.readBytes(1);
                    }
                    public static class XyzColor extends KaitaiStruct {
                        public static XyzColor fromFile(String fileName) throws IOException {
                            return new XyzColor(new ByteBufferKaitaiStream(fileName));
                        }

                        public XyzColor(KaitaiStream _io) {
                            this(_io, null, null);
                        }

                        public XyzColor(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.PhotoFilterData _parent) {
                            this(_io, _parent, null);
                        }

                        public XyzColor(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.PhotoFilterData _parent, PsdKaitai _root) {
                            super(_io);
                            this._parent = _parent;
                            this._root = _root;
                            _read();
                        }
                        private void _read() {
                            this.x = this._io.readBytes(4);
                            this.y = this._io.readBytes(4);
                            this.z = this._io.readBytes(4);
                        }
                        private byte[] x;
                        private byte[] y;
                        private byte[] z;
                        private PsdKaitai _root;
                        private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.PhotoFilterData _parent;
                        public byte[] x() { return x; }
                        public byte[] y() { return y; }
                        public byte[] z() { return z; }
                        public PsdKaitai _root() { return _root; }
                        public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.PhotoFilterData _parent() { return _parent; }
                    }
                    private short version;
                    private XyzColor xyzColor;
                    private ColorStructure color;
                    private byte[] density;
                    private byte[] preserveLuminosity;
                    private PsdKaitai _root;
                    private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent;

                    /**
                     * value should be 2 or 3
                     */
                    public short version() { return version; }
                    public XyzColor xyzColor() { return xyzColor; }
                    public ColorStructure color() { return color; }
                    public byte[] density() { return density; }
                    public byte[] preserveLuminosity() { return preserveLuminosity; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent() { return _parent; }
                }
                public static class LayerIdData extends KaitaiStruct {
                    public static LayerIdData fromFile(String fileName) throws IOException {
                        return new LayerIdData(new ByteBufferKaitaiStream(fileName));
                    }

                    public LayerIdData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public LayerIdData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent) {
                        this(_io, _parent, null);
                    }

                    public LayerIdData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.layerId = this._io.readS4be();
                    }
                    private int layerId;
                    private PsdKaitai _root;
                    private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent;
                    public int layerId() { return layerId; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent() { return _parent; }
                }
                public static class ChannelMixerData extends KaitaiStruct {
                    public static ChannelMixerData fromFile(String fileName) throws IOException {
                        return new ChannelMixerData(new ByteBufferKaitaiStream(fileName));
                    }

                    public ChannelMixerData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public ChannelMixerData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent) {
                        this(_io, _parent, null);
                    }

                    public ChannelMixerData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.version = this._io.readS2be();
                        this.monochrome = this._io.readBytes(2);
                        this.colorData = this._io.readBytes(20);
                    }
                    private short version;
                    private byte[] monochrome;
                    private byte[] colorData;
                    private PsdKaitai _root;
                    private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent;

                    /**
                     * value should be 1
                     */
                    public short version() { return version; }
                    public byte[] monochrome() { return monochrome; }

                    /**
                     * vendor documentation says this 20 bytes is "RGB or CMYK color plus constant for the mixer settings. 4 * 2 bytes of color with 2 bytes of constant" but 4 * 4 != 20 and 4 * 2 + 2 != 20 so it is unclear how these 20 bytes are really allocated
                     */
                    public byte[] colorData() { return colorData; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent() { return _parent; }
                }
                public static class BrightnessAndContrastData extends KaitaiStruct {
                    public static BrightnessAndContrastData fromFile(String fileName) throws IOException {
                        return new BrightnessAndContrastData(new ByteBufferKaitaiStream(fileName));
                    }

                    public BrightnessAndContrastData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public BrightnessAndContrastData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent) {
                        this(_io, _parent, null);
                    }

                    public BrightnessAndContrastData(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.brightness = this._io.readBytes(2);
                        this.contrast = this._io.readBytes(2);
                        this.meanValueForBrightnessAndContrast = this._io.readBytes(2);
                        this.labColorOnly = this._io.readBytes(1);
                    }
                    private byte[] brightness;
                    private byte[] contrast;
                    private byte[] meanValueForBrightnessAndContrast;
                    private byte[] labColorOnly;
                    private PsdKaitai _root;
                    private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent;
                    public byte[] brightness() { return brightness; }
                    public byte[] contrast() { return contrast; }
                    public byte[] meanValueForBrightnessAndContrast() { return meanValueForBrightnessAndContrast; }
                    public byte[] labColorOnly() { return labColorOnly; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation _parent() { return _parent; }
                }
                private byte[] signature;
                private AdjustmentLayerTypes dataType;
                private int sizeOfData;
                private Object data;
                private PsdKaitai _root;
                private KaitaiStruct _parent;
                private byte[] _raw_data;

                /**
                 * should be either 8BIM or 8B64
                 */
                public byte[] signature() { return signature; }
                public AdjustmentLayerTypes dataType() { return dataType; }

                /**
                 * value should be an even number (have 2 as a factor)
                 */
                public int sizeOfData() { return sizeOfData; }
                public Object data() { return data; }
                public PsdKaitai _root() { return _root; }
                public KaitaiStruct _parent() { return _parent; }
                public byte[] _raw_data() { return _raw_data; }
            }
            private LayerInformation layerInformation;
            private GlobalLayerMaskInformation globalLayerMaskInformation;
            private ArrayList<AdditionalLayerInformation> additionalLayerInformation;
            private PsdKaitai _root;
            private PsdKaitai.LayerAndMaskInformation _parent;
            public LayerInformation layerInformation() { return layerInformation; }
            public GlobalLayerMaskInformation globalLayerMaskInformation() { return globalLayerMaskInformation; }
            public ArrayList<AdditionalLayerInformation> additionalLayerInformation() { return additionalLayerInformation; }
            public PsdKaitai _root() { return _root; }
            public PsdKaitai.LayerAndMaskInformation _parent() { return _parent; }
        }
        private int sizeOfData;
        private LayerAndMaskInformationData data;
        private PsdKaitai _root;
        private PsdKaitai _parent;
        private byte[] _raw_data;
        public int sizeOfData() { return sizeOfData; }
        public LayerAndMaskInformationData data() { return data; }
        public PsdKaitai _root() { return _root; }
        public PsdKaitai _parent() { return _parent; }
        public byte[] _raw_data() { return _raw_data; }
    }
    public static class DescriptorResource extends KaitaiStruct {
        public static DescriptorResource fromFile(String fileName) throws IOException {
            return new DescriptorResource(new ByteBufferKaitaiStream(fileName));
        }

        public DescriptorResource(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DescriptorResource(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public DescriptorResource(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nameFromClassId = new UnicodeStringResource(this._io, this, _root);
            this.classId = new StringOrKey(this._io, this, _root);
            this.numberOfItemsInDescriptor = this._io.readS4be();
            item = new ArrayList<DescriptorItem>(((Number) (numberOfItemsInDescriptor())).intValue());
            for (int i = 0; i < numberOfItemsInDescriptor(); i++) {
                this.item.add(new DescriptorItem(this._io, this, _root));
            }
        }
        public static class DescriptorItem extends KaitaiStruct {
            public static DescriptorItem fromFile(String fileName) throws IOException {
                return new DescriptorItem(new ByteBufferKaitaiStream(fileName));
            }

            public enum OsTypeKeys {
                GLOBAL_CLASS(1198285379),
                GLOBAL_OBJECT(1198285391),
                DESCRIPTOR(1331849827),
                STRING(1413830740),
                UNIT_FLOAT(1433302086),
                LIST(1449938035),
                ALIAS(1634494835),
                BOOLEAN(1651470188),
                LARGE_INTEGER(1668246896),
                DOUBLE(1685026146),
                ENUMERATED(1701737837),
                INTEGER(1819242087),
                REFERENCE(1868720672),
                RAW_DATA(1952740449),
                CLASS(1954115685);

                private final long id;
                OsTypeKeys(long id) { this.id = id; }
                public long id() { return id; }
                private static final Map<Long, OsTypeKeys> byId = new HashMap<Long, OsTypeKeys>(15);
                static {
                    for (OsTypeKeys e : OsTypeKeys.values())
                        byId.put(e.id(), e);
                }
                public static OsTypeKeys byId(long id) { return byId.get(id); }
            }

            public DescriptorItem(KaitaiStream _io) {
                this(_io, null, null);
            }

            public DescriptorItem(KaitaiStream _io, PsdKaitai.DescriptorResource _parent) {
                this(_io, _parent, null);
            }

            public DescriptorItem(KaitaiStream _io, PsdKaitai.DescriptorResource _parent, PsdKaitai _root) {
                super(_io);
                this._parent = _parent;
                this._root = _root;
                _read();
            }
            private void _read() {
                this.key = new StringOrKey(this._io, this, _root);
                this.dataType = OsTypeKeys.byId(this._io.readU4be());
                {
                    OsTypeKeys on = dataType();
                    if (on != null) {
                        switch (dataType()) {
                        case LARGE_INTEGER: {
                            this.data = new LargeIntegerItemData(this._io, this, _root);
                            break;
                        }
                        case DESCRIPTOR: {
                            this.data = new DescriptorItemData(this._io, this, _root);
                            break;
                        }
                        case CLASS: {
                            this.data = new ClassItemData(this._io, this, _root);
                            break;
                        }
                        case DOUBLE: {
                            this.data = new DoubleItemData(this._io, this, _root);
                            break;
                        }
                        case INTEGER: {
                            this.data = new IntegerItemData(this._io, this, _root);
                            break;
                        }
                        case GLOBAL_CLASS: {
                            this.data = new ClassItemData(this._io, this, _root);
                            break;
                        }
                        case UNIT_FLOAT: {
                            this.data = new UnitFloatItemData(this._io, this, _root);
                            break;
                        }
                        case ENUMERATED: {
                            this.data = new EnumeratedItemData(this._io, this, _root);
                            break;
                        }
                        case BOOLEAN: {
                            this.data = new BooleanItemData(this._io, this, _root);
                            break;
                        }
                        case REFERENCE: {
                            this.data = new ReferenceItemData(this._io, this, _root);
                            break;
                        }
                        case GLOBAL_OBJECT: {
                            this.data = new DescriptorItemData(this._io, this, _root);
                            break;
                        }
                        case ALIAS: {
                            this.data = new AliasItemData(this._io, this, _root);
                            break;
                        }
                        case STRING: {
                            this.data = new StringItemData(this._io, this, _root);
                            break;
                        }
                        case LIST: {
                            this.data = new ListItemData(this._io, this, _root);
                            break;
                        }
                        }
                    }
                }
            }
            public static class ListItemData extends KaitaiStruct {
                public static ListItemData fromFile(String fileName) throws IOException {
                    return new ListItemData(new ByteBufferKaitaiStream(fileName));
                }

                public ListItemData(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public ListItemData(KaitaiStream _io, KaitaiStruct _parent) {
                    this(_io, _parent, null);
                }

                public ListItemData(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.numberOfItems = this._io.readS4be();
                    items = new ArrayList<ListItem>(((Number) (numberOfItems())).intValue());
                    for (int i = 0; i < numberOfItems(); i++) {
                        this.items.add(new ListItem(this._io, this, _root));
                    }
                }
                public static class ListItem extends KaitaiStruct {
                    public static ListItem fromFile(String fileName) throws IOException {
                        return new ListItem(new ByteBufferKaitaiStream(fileName));
                    }

                    public ListItem(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public ListItem(KaitaiStream _io, PsdKaitai.DescriptorResource.DescriptorItem.ListItemData _parent) {
                        this(_io, _parent, null);
                    }

                    public ListItem(KaitaiStream _io, PsdKaitai.DescriptorResource.DescriptorItem.ListItemData _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.itemDataType = PsdKaitai.DescriptorResource.DescriptorItem.OsTypeKeys.byId(this._io.readU4be());
                        {
                            OsTypeKeys on = itemDataType();
                            if (on != null) {
                                switch (itemDataType()) {
                                case LARGE_INTEGER: {
                                    this.itemData = new LargeIntegerItemData(this._io, this, _root);
                                    break;
                                }
                                case DESCRIPTOR: {
                                    this.itemData = new DescriptorItemData(this._io, this, _root);
                                    break;
                                }
                                case CLASS: {
                                    this.itemData = new ClassItemData(this._io, this, _root);
                                    break;
                                }
                                case DOUBLE: {
                                    this.itemData = new DoubleItemData(this._io, this, _root);
                                    break;
                                }
                                case INTEGER: {
                                    this.itemData = new IntegerItemData(this._io, this, _root);
                                    break;
                                }
                                case GLOBAL_CLASS: {
                                    this.itemData = new ClassItemData(this._io, this, _root);
                                    break;
                                }
                                case UNIT_FLOAT: {
                                    this.itemData = new UnitFloatItemData(this._io, this, _root);
                                    break;
                                }
                                case ENUMERATED: {
                                    this.itemData = new EnumeratedItemData(this._io, this, _root);
                                    break;
                                }
                                case BOOLEAN: {
                                    this.itemData = new BooleanItemData(this._io, this, _root);
                                    break;
                                }
                                case REFERENCE: {
                                    this.itemData = new ReferenceItemData(this._io, this, _root);
                                    break;
                                }
                                case GLOBAL_OBJECT: {
                                    this.itemData = new DescriptorItemData(this._io, this, _root);
                                    break;
                                }
                                case ALIAS: {
                                    this.itemData = new AliasItemData(this._io, this, _root);
                                    break;
                                }
                                case STRING: {
                                    this.itemData = new StringItemData(this._io, this, _root);
                                    break;
                                }
                                case LIST: {
                                    this.itemData = new ListItemData(this._io, this, _root);
                                    break;
                                }
                                }
                            }
                        }
                    }
                    private OsTypeKeys itemDataType;
                    private KaitaiStruct itemData;
                    private PsdKaitai _root;
                    private PsdKaitai.DescriptorResource.DescriptorItem.ListItemData _parent;
                    public OsTypeKeys itemDataType() { return itemDataType; }
                    public KaitaiStruct itemData() { return itemData; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.DescriptorResource.DescriptorItem.ListItemData _parent() { return _parent; }
                }
                private int numberOfItems;
                private ArrayList<ListItem> items;
                private PsdKaitai _root;
                private KaitaiStruct _parent;
                public int numberOfItems() { return numberOfItems; }
                public ArrayList<ListItem> items() { return items; }
                public PsdKaitai _root() { return _root; }
                public KaitaiStruct _parent() { return _parent; }
            }
            public static class LargeIntegerItemData extends KaitaiStruct {
                public static LargeIntegerItemData fromFile(String fileName) throws IOException {
                    return new LargeIntegerItemData(new ByteBufferKaitaiStream(fileName));
                }

                public LargeIntegerItemData(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public LargeIntegerItemData(KaitaiStream _io, KaitaiStruct _parent) {
                    this(_io, _parent, null);
                }

                public LargeIntegerItemData(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.value = this._io.readS8be();
                }
                private long value;
                private PsdKaitai _root;
                private KaitaiStruct _parent;
                public long value() { return value; }
                public PsdKaitai _root() { return _root; }
                public KaitaiStruct _parent() { return _parent; }
            }
            public static class AliasItemData extends KaitaiStruct {
                public static AliasItemData fromFile(String fileName) throws IOException {
                    return new AliasItemData(new ByteBufferKaitaiStream(fileName));
                }

                public AliasItemData(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public AliasItemData(KaitaiStream _io, KaitaiStruct _parent) {
                    this(_io, _parent, null);
                }

                public AliasItemData(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.sizeOfData = this._io.readS4be();
                    this.data = this._io.readBytes(sizeOfData());
                }
                private int sizeOfData;
                private byte[] data;
                private PsdKaitai _root;
                private KaitaiStruct _parent;
                public int sizeOfData() { return sizeOfData; }
                public byte[] data() { return data; }
                public PsdKaitai _root() { return _root; }
                public KaitaiStruct _parent() { return _parent; }
            }
            public static class ClassItemData extends KaitaiStruct {
                public static ClassItemData fromFile(String fileName) throws IOException {
                    return new ClassItemData(new ByteBufferKaitaiStream(fileName));
                }

                public ClassItemData(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public ClassItemData(KaitaiStream _io, KaitaiStruct _parent) {
                    this(_io, _parent, null);
                }

                public ClassItemData(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.nameFromClassId = new UnicodeStringResource(this._io, this, _root);
                    this.classId = new StringOrKey(this._io, this, _root);
                }
                private UnicodeStringResource nameFromClassId;
                private StringOrKey classId;
                private PsdKaitai _root;
                private KaitaiStruct _parent;
                public UnicodeStringResource nameFromClassId() { return nameFromClassId; }
                public StringOrKey classId() { return classId; }
                public PsdKaitai _root() { return _root; }
                public KaitaiStruct _parent() { return _parent; }
            }
            public static class IntegerItemData extends KaitaiStruct {
                public static IntegerItemData fromFile(String fileName) throws IOException {
                    return new IntegerItemData(new ByteBufferKaitaiStream(fileName));
                }

                public IntegerItemData(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public IntegerItemData(KaitaiStream _io, KaitaiStruct _parent) {
                    this(_io, _parent, null);
                }

                public IntegerItemData(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.value = this._io.readS4be();
                }
                private int value;
                private PsdKaitai _root;
                private KaitaiStruct _parent;
                public int value() { return value; }
                public PsdKaitai _root() { return _root; }
                public KaitaiStruct _parent() { return _parent; }
            }
            public static class StringItemData extends KaitaiStruct {
                public static StringItemData fromFile(String fileName) throws IOException {
                    return new StringItemData(new ByteBufferKaitaiStream(fileName));
                }

                public StringItemData(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public StringItemData(KaitaiStream _io, KaitaiStruct _parent) {
                    this(_io, _parent, null);
                }

                public StringItemData(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.string = new UnicodeStringResource(this._io, this, _root);
                }
                private UnicodeStringResource string;
                private PsdKaitai _root;
                private KaitaiStruct _parent;
                public UnicodeStringResource string() { return string; }
                public PsdKaitai _root() { return _root; }
                public KaitaiStruct _parent() { return _parent; }
            }
            public static class UnitFloatItemData extends KaitaiStruct {
                public static UnitFloatItemData fromFile(String fileName) throws IOException {
                    return new UnitFloatItemData(new ByteBufferKaitaiStream(fileName));
                }

                public enum Units {
                    ANGLE_BASE_DEGREES(591490663),
                    NONE_COERCED(592342629),
                    PERCENT_UNIT_VALUE(592474723),
                    PIXELS_TAGGED_UNIT_VALUE(592476268),
                    DISTANCE_BASE_72PPI(592604276),
                    DENSITY_BASE_PER_INCH(592606060);

                    private final long id;
                    Units(long id) { this.id = id; }
                    public long id() { return id; }
                    private static final Map<Long, Units> byId = new HashMap<Long, Units>(6);
                    static {
                        for (Units e : Units.values())
                            byId.put(e.id(), e);
                    }
                    public static Units byId(long id) { return byId.get(id); }
                }

                public UnitFloatItemData(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public UnitFloatItemData(KaitaiStream _io, KaitaiStruct _parent) {
                    this(_io, _parent, null);
                }

                public UnitFloatItemData(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.unit = Units.byId(this._io.readS4be());
                    this.value = this._io.readF8be();
                }
                private Units unit;
                private double value;
                private PsdKaitai _root;
                private KaitaiStruct _parent;
                public Units unit() { return unit; }
                public double value() { return value; }
                public PsdKaitai _root() { return _root; }
                public KaitaiStruct _parent() { return _parent; }
            }
            public static class ReferenceItemData extends KaitaiStruct {
                public static ReferenceItemData fromFile(String fileName) throws IOException {
                    return new ReferenceItemData(new ByteBufferKaitaiStream(fileName));
                }

                public enum OsTypeKeysForTypeToUse {
                    CLASS(1131180915),
                    ENUMERATED_REFERENCE(1164864882),
                    IDENTIFIER(1231318644),
                    INDEX(1768842360),
                    NAME(1851878757),
                    PROPERTY(1886547824),
                    OFFSET(1919249509);

                    private final long id;
                    OsTypeKeysForTypeToUse(long id) { this.id = id; }
                    public long id() { return id; }
                    private static final Map<Long, OsTypeKeysForTypeToUse> byId = new HashMap<Long, OsTypeKeysForTypeToUse>(7);
                    static {
                        for (OsTypeKeysForTypeToUse e : OsTypeKeysForTypeToUse.values())
                            byId.put(e.id(), e);
                    }
                    public static OsTypeKeysForTypeToUse byId(long id) { return byId.get(id); }
                }

                public ReferenceItemData(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public ReferenceItemData(KaitaiStream _io, KaitaiStruct _parent) {
                    this(_io, _parent, null);
                }

                public ReferenceItemData(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.numberOfItems = this._io.readS4be();
                    this.dataType = OsTypeKeysForTypeToUse.byId(this._io.readU4be());
                    {
                        OsTypeKeysForTypeToUse on = dataType();
                        if (on != null) {
                            switch (dataType()) {
                            case PROPERTY: {
                                this.data = new ReferenceItemPropertyData(this._io, this, _root);
                                break;
                            }
                            case CLASS: {
                                this.data = new ReferenceItemClassData(this._io, this, _root);
                                break;
                            }
                            case ENUMERATED_REFERENCE: {
                                this.data = new ReferenceItemEnumeratedReferenceData(this._io, this, _root);
                                break;
                            }
                            case OFFSET: {
                                this.data = new ReferenceItemOffsetData(this._io, this, _root);
                                break;
                            }
                            }
                        }
                    }
                }
                public static class ReferenceItemPropertyData extends KaitaiStruct {
                    public static ReferenceItemPropertyData fromFile(String fileName) throws IOException {
                        return new ReferenceItemPropertyData(new ByteBufferKaitaiStream(fileName));
                    }

                    public ReferenceItemPropertyData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public ReferenceItemPropertyData(KaitaiStream _io, PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent) {
                        this(_io, _parent, null);
                    }

                    public ReferenceItemPropertyData(KaitaiStream _io, PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.nameFromClassId = new UnicodeStringResource(this._io, this, _root);
                        this.classId = new StringOrKey(this._io, this, _root);
                        this.keyId = new StringOrKey(this._io, this, _root);
                    }
                    private UnicodeStringResource nameFromClassId;
                    private StringOrKey classId;
                    private StringOrKey keyId;
                    private PsdKaitai _root;
                    private PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent;
                    public UnicodeStringResource nameFromClassId() { return nameFromClassId; }
                    public StringOrKey classId() { return classId; }
                    public StringOrKey keyId() { return keyId; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent() { return _parent; }
                }
                public static class ReferenceItemClassData extends KaitaiStruct {
                    public static ReferenceItemClassData fromFile(String fileName) throws IOException {
                        return new ReferenceItemClassData(new ByteBufferKaitaiStream(fileName));
                    }

                    public ReferenceItemClassData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public ReferenceItemClassData(KaitaiStream _io, PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent) {
                        this(_io, _parent, null);
                    }

                    public ReferenceItemClassData(KaitaiStream _io, PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.nameFromClassId = new UnicodeStringResource(this._io, this, _root);
                        this.classId = new StringOrKey(this._io, this, _root);
                    }
                    private UnicodeStringResource nameFromClassId;
                    private StringOrKey classId;
                    private PsdKaitai _root;
                    private PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent;
                    public UnicodeStringResource nameFromClassId() { return nameFromClassId; }
                    public StringOrKey classId() { return classId; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent() { return _parent; }
                }
                public static class ReferenceItemEnumeratedReferenceData extends KaitaiStruct {
                    public static ReferenceItemEnumeratedReferenceData fromFile(String fileName) throws IOException {
                        return new ReferenceItemEnumeratedReferenceData(new ByteBufferKaitaiStream(fileName));
                    }

                    public ReferenceItemEnumeratedReferenceData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public ReferenceItemEnumeratedReferenceData(KaitaiStream _io, PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent) {
                        this(_io, _parent, null);
                    }

                    public ReferenceItemEnumeratedReferenceData(KaitaiStream _io, PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.nameFromClassId = new UnicodeStringResource(this._io, this, _root);
                        this.classId = new StringOrKey(this._io, this, _root);
                        this.typeId = new StringOrKey(this._io, this, _root);
                        this.enumValue = new StringOrKey(this._io, this, _root);
                    }
                    private UnicodeStringResource nameFromClassId;
                    private StringOrKey classId;
                    private StringOrKey typeId;
                    private StringOrKey enumValue;
                    private PsdKaitai _root;
                    private PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent;
                    public UnicodeStringResource nameFromClassId() { return nameFromClassId; }
                    public StringOrKey classId() { return classId; }
                    public StringOrKey typeId() { return typeId; }
                    public StringOrKey enumValue() { return enumValue; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent() { return _parent; }
                }
                public static class ReferenceItemOffsetData extends KaitaiStruct {
                    public static ReferenceItemOffsetData fromFile(String fileName) throws IOException {
                        return new ReferenceItemOffsetData(new ByteBufferKaitaiStream(fileName));
                    }

                    public ReferenceItemOffsetData(KaitaiStream _io) {
                        this(_io, null, null);
                    }

                    public ReferenceItemOffsetData(KaitaiStream _io, PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent) {
                        this(_io, _parent, null);
                    }

                    public ReferenceItemOffsetData(KaitaiStream _io, PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent, PsdKaitai _root) {
                        super(_io);
                        this._parent = _parent;
                        this._root = _root;
                        _read();
                    }
                    private void _read() {
                        this.nameFromClassId = new UnicodeStringResource(this._io, this, _root);
                        this.classId = new StringOrKey(this._io, this, _root);
                        this.offset = this._io.readBytes(4);
                    }
                    private UnicodeStringResource nameFromClassId;
                    private StringOrKey classId;
                    private byte[] offset;
                    private PsdKaitai _root;
                    private PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent;
                    public UnicodeStringResource nameFromClassId() { return nameFromClassId; }
                    public StringOrKey classId() { return classId; }
                    public byte[] offset() { return offset; }
                    public PsdKaitai _root() { return _root; }
                    public PsdKaitai.DescriptorResource.DescriptorItem.ReferenceItemData _parent() { return _parent; }
                }
                private int numberOfItems;
                private OsTypeKeysForTypeToUse dataType;
                private KaitaiStruct data;
                private PsdKaitai _root;
                private KaitaiStruct _parent;
                public int numberOfItems() { return numberOfItems; }
                public OsTypeKeysForTypeToUse dataType() { return dataType; }
                public KaitaiStruct data() { return data; }
                public PsdKaitai _root() { return _root; }
                public KaitaiStruct _parent() { return _parent; }
            }
            public static class DoubleItemData extends KaitaiStruct {
                public static DoubleItemData fromFile(String fileName) throws IOException {
                    return new DoubleItemData(new ByteBufferKaitaiStream(fileName));
                }

                public DoubleItemData(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public DoubleItemData(KaitaiStream _io, KaitaiStruct _parent) {
                    this(_io, _parent, null);
                }

                public DoubleItemData(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.value = this._io.readF8be();
                }
                private double value;
                private PsdKaitai _root;
                private KaitaiStruct _parent;
                public double value() { return value; }
                public PsdKaitai _root() { return _root; }
                public KaitaiStruct _parent() { return _parent; }
            }
            public static class BooleanItemData extends KaitaiStruct {
                public static BooleanItemData fromFile(String fileName) throws IOException {
                    return new BooleanItemData(new ByteBufferKaitaiStream(fileName));
                }

                public BooleanItemData(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public BooleanItemData(KaitaiStream _io, KaitaiStruct _parent) {
                    this(_io, _parent, null);
                }

                public BooleanItemData(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.value = this._io.readBitsIntBe(8);
                }
                private long value;
                private PsdKaitai _root;
                private KaitaiStruct _parent;
                public long value() { return value; }
                public PsdKaitai _root() { return _root; }
                public KaitaiStruct _parent() { return _parent; }
            }
            public static class EnumeratedItemData extends KaitaiStruct {
                public static EnumeratedItemData fromFile(String fileName) throws IOException {
                    return new EnumeratedItemData(new ByteBufferKaitaiStream(fileName));
                }

                public EnumeratedItemData(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public EnumeratedItemData(KaitaiStream _io, KaitaiStruct _parent) {
                    this(_io, _parent, null);
                }

                public EnumeratedItemData(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.typeId = new StringOrKey(this._io, this, _root);
                    this.enumValue = new StringOrKey(this._io, this, _root);
                }
                private StringOrKey typeId;
                private StringOrKey enumValue;
                private PsdKaitai _root;
                private KaitaiStruct _parent;
                public StringOrKey typeId() { return typeId; }
                public StringOrKey enumValue() { return enumValue; }
                public PsdKaitai _root() { return _root; }
                public KaitaiStruct _parent() { return _parent; }
            }
            public static class DescriptorItemData extends KaitaiStruct {
                public static DescriptorItemData fromFile(String fileName) throws IOException {
                    return new DescriptorItemData(new ByteBufferKaitaiStream(fileName));
                }

                public DescriptorItemData(KaitaiStream _io) {
                    this(_io, null, null);
                }

                public DescriptorItemData(KaitaiStream _io, KaitaiStruct _parent) {
                    this(_io, _parent, null);
                }

                public DescriptorItemData(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                    super(_io);
                    this._parent = _parent;
                    this._root = _root;
                    _read();
                }
                private void _read() {
                    this.descriptor = new DescriptorResource(this._io, this, _root);
                }
                private DescriptorResource descriptor;
                private PsdKaitai _root;
                private KaitaiStruct _parent;
                public DescriptorResource descriptor() { return descriptor; }
                public PsdKaitai _root() { return _root; }
                public KaitaiStruct _parent() { return _parent; }
            }
            private StringOrKey key;
            private OsTypeKeys dataType;
            private KaitaiStruct data;
            private PsdKaitai _root;
            private PsdKaitai.DescriptorResource _parent;
            public StringOrKey key() { return key; }
            public OsTypeKeys dataType() { return dataType; }
            public KaitaiStruct data() { return data; }
            public PsdKaitai _root() { return _root; }
            public PsdKaitai.DescriptorResource _parent() { return _parent; }
        }
        public static class StringOrKey extends KaitaiStruct {
            public static StringOrKey fromFile(String fileName) throws IOException {
                return new StringOrKey(new ByteBufferKaitaiStream(fileName));
            }

            public StringOrKey(KaitaiStream _io) {
                this(_io, null, null);
            }

            public StringOrKey(KaitaiStream _io, KaitaiStruct _parent) {
                this(_io, _parent, null);
            }

            public StringOrKey(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
                super(_io);
                this._parent = _parent;
                this._root = _root;
                _read();
            }
            private void _read() {
                this.length = this._io.readS4be();
                if (length() > 0) {
                    this.string = new String(this._io.readBytes(length()), Charset.forName("ascii"));
                }
                if (length() == 0) {
                    this.key = new String(this._io.readBytes(4), Charset.forName("ascii"));
                }
            }
            private int length;
            private String string;
            private String key;
            private PsdKaitai _root;
            private KaitaiStruct _parent;
            public int length() { return length; }
            public String string() { return string; }
            public String key() { return key; }
            public PsdKaitai _root() { return _root; }
            public KaitaiStruct _parent() { return _parent; }
        }
        private UnicodeStringResource nameFromClassId;
        private StringOrKey classId;
        private int numberOfItemsInDescriptor;
        private ArrayList<DescriptorItem> item;
        private PsdKaitai _root;
        private KaitaiStruct _parent;
        public UnicodeStringResource nameFromClassId() { return nameFromClassId; }
        public StringOrKey classId() { return classId; }
        public int numberOfItemsInDescriptor() { return numberOfItemsInDescriptor; }
        public ArrayList<DescriptorItem> item() { return item; }
        public PsdKaitai _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class Header extends KaitaiStruct {
        public static Header fromFile(String fileName) throws IOException {
            return new Header(new ByteBufferKaitaiStream(fileName));
        }

        public Header(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Header(KaitaiStream _io, PsdKaitai _parent) {
            this(_io, _parent, null);
        }

        public Header(KaitaiStream _io, PsdKaitai _parent, PsdKaitai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.signature = this._io.readBytes(4);
            if (!(Arrays.equals(signature(), new byte[] { 56, 66, 80, 83 }))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[] { 56, 66, 80, 83 }, signature(), _io(), "/types/header/seq/0");
            }
            this.version = this._io.readBytes(2);
            if (!(Arrays.equals(version(), new byte[] { 0, 1 }))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[] { 0, 1 }, version(), _io(), "/types/header/seq/1");
            }
            this.reservedField = this._io.readBytes(6);
            if (!(Arrays.equals(reservedField(), new byte[] { 0, 0, 0, 0, 0, 0 }))) {
                throw new KaitaiStream.ValidationNotEqualError(new byte[] { 0, 0, 0, 0, 0, 0 }, reservedField(), _io(), "/types/header/seq/2");
            }
            this.numberOfChannels = this._io.readS2be();
            this.dimensions = new Dimensions(this._io, this, _root);
            this.depth = this._io.readS2be();
            this.colorMode = PsdKaitai.ColorMode.byId(this._io.readS2be());
        }
        public static class Dimensions extends KaitaiStruct {
            public static Dimensions fromFile(String fileName) throws IOException {
                return new Dimensions(new ByteBufferKaitaiStream(fileName));
            }

            public Dimensions(KaitaiStream _io) {
                this(_io, null, null);
            }

            public Dimensions(KaitaiStream _io, PsdKaitai.Header _parent) {
                this(_io, _parent, null);
            }

            public Dimensions(KaitaiStream _io, PsdKaitai.Header _parent, PsdKaitai _root) {
                super(_io);
                this._parent = _parent;
                this._root = _root;
                _read();
            }
            private void _read() {
                this.height = this._io.readS4be();
                this.width = this._io.readS4be();
            }
            private int height;
            private int width;
            private PsdKaitai _root;
            private PsdKaitai.Header _parent;

            /**
             * measured in number of pixels, value must be in range 1 to 30000
             */
            public int height() { return height; }

            /**
             * measured in number of pixels, value must be in range 1 to 30000
             */
            public int width() { return width; }
            public PsdKaitai _root() { return _root; }
            public PsdKaitai.Header _parent() { return _parent; }
        }
        private byte[] signature;
        private byte[] version;
        private byte[] reservedField;
        private short numberOfChannels;
        private Dimensions dimensions;
        private short depth;
        private ColorMode colorMode;
        private PsdKaitai _root;
        private PsdKaitai _parent;
        public byte[] signature() { return signature; }
        public byte[] version() { return version; }
        public byte[] reservedField() { return reservedField; }

        /**
         * value must be in range 1 to 56
         */
        public short numberOfChannels() { return numberOfChannels; }
        public Dimensions dimensions() { return dimensions; }

        /**
         * number of bits per channel, either 1, 8, 16 or 32
         */
        public short depth() { return depth; }
        public ColorMode colorMode() { return colorMode; }
        public PsdKaitai _root() { return _root; }
        public PsdKaitai _parent() { return _parent; }
    }
    public static class PascalStringPaddedTo2ByteMultiple extends KaitaiStruct {
        public static PascalStringPaddedTo2ByteMultiple fromFile(String fileName) throws IOException {
            return new PascalStringPaddedTo2ByteMultiple(new ByteBufferKaitaiStream(fileName));
        }

        public PascalStringPaddedTo2ByteMultiple(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PascalStringPaddedTo2ByteMultiple(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public PascalStringPaddedTo2ByteMultiple(KaitaiStream _io, KaitaiStruct _parent, PsdKaitai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.length = this._io.readU1();
            this.string = new String(this._io.readBytes(length()), Charset.forName("ascii"));
            if ( ((length() == 0) || (KaitaiStream.mod(length(), 2) == 1)) ) {
                this.padding = this._io.readBytes(1);
            }
        }
        private int length;
        private String string;
        private byte[] padding;
        private PsdKaitai _root;
        private KaitaiStruct _parent;
        public int length() { return length; }
        public String string() { return string; }
        public byte[] padding() { return padding; }
        public PsdKaitai _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class BoundingBoxType4x8 extends KaitaiStruct {
        public static BoundingBoxType4x8 fromFile(String fileName) throws IOException {
            return new BoundingBoxType4x8(new ByteBufferKaitaiStream(fileName));
        }

        public BoundingBoxType4x8(KaitaiStream _io) {
            this(_io, null, null);
        }

        public BoundingBoxType4x8(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolObjectSettingData _parent) {
            this(_io, _parent, null);
        }

        public BoundingBoxType4x8(KaitaiStream _io, PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolObjectSettingData _parent, PsdKaitai _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.top = this._io.readS8be();
            this.left = this._io.readS8be();
            this.bottom = this._io.readS8be();
            this.right = this._io.readS8be();
        }
        private long top;
        private long left;
        private long bottom;
        private long right;
        private PsdKaitai _root;
        private PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolObjectSettingData _parent;
        public long top() { return top; }
        public long left() { return left; }
        public long bottom() { return bottom; }
        public long right() { return right; }
        public PsdKaitai _root() { return _root; }
        public PsdKaitai.LayerAndMaskInformation.LayerAndMaskInformationData.AdditionalLayerInformation.TypeToolObjectSettingData _parent() { return _parent; }
    }
    private Header header;
    private ColorModeData colorModeData;
    private ImageResources imageResources;
    private LayerAndMaskInformation layerAndMaskInformation;
    private PsdKaitai _root;
    private KaitaiStruct _parent;
    public Header header() { return header; }
    public ColorModeData colorModeData() { return colorModeData; }
    public ImageResources imageResources() { return imageResources; }
    public LayerAndMaskInformation layerAndMaskInformation() { return layerAndMaskInformation; }
    public PsdKaitai _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
